package flow.stateFlow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.joinAll
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class NotificationManager {
    private val _notifications = MutableStateFlow<List<String>>(emptyList())
    val notifications: StateFlow<List<String>> = _notifications.asStateFlow()
    fun addNotification(notification: String) {
        _notifications.value = _notifications.value + notification
    }
}
fun main() = runBlocking {

    val notificationManager = NotificationManager()

    val collectorJob = launch {
        notificationManager.notifications.collect { notifications ->
            println("New notifications: $notifications")
        }
    }

    val senderJobA = launch {
        notificationManager.addNotification("User A sent a message")
    }
    delay(1000)

    val senderJobB = launch {
        notificationManager.addNotification("User B uploaded a photo")
    }
    delay(1000)

    val senderJobC = launch {
        notificationManager.addNotification("User C commented on your post")
    }
    delay(1000)

    joinAll(senderJobA, senderJobB, senderJobC)
    delay(500)

    collectorJob.cancel()
}

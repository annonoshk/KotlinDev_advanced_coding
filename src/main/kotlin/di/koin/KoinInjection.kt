package koin

enum class Status { TODO, ONGOING, DONE }

data class Task(
    val name: String,
    var status: Status
)

class DataSource {
    val tasks: MutableList<Task> = mutableListOf()
}

fun findTaskByName(name: String, source: DataSource): Task? = source.tasks.find { it.name == name }

fun listByStatus(status: Status, source: DataSource): List<Task> = source.tasks.filter { it.status == status }

fun createTask(task: Task, source: DataSource) {
    source.tasks.add(task)
}

fun updateTaskStatus(name: String, status: Status, source: DataSource) {
    val task = findTaskByName(name, source) ?: throw Exception("Task not found")
    task.status = status
}


package di.koin

enum class Status { TODO, ONGOING, DONE }

data class Task(
    val name: String,
    var status: Status
)

class DataSource {
    val tasks: MutableList<Task> = mutableListOf()
}

/*fun findTaskByName(name: String, source: DataSource): Task? = source.tasks.find { it.name == name }

fun listByStatus(status: Status, source: DataSource): List<Task> = source.tasks.filter { it.status == status }

fun createTask(task: Task, source: DataSource) {
    source.tasks.add(task)
}

fun updateTaskStatus(name: String, status: Status, source: DataSource) {
    val task = findTaskByName(name, source) ?: throw Exception("Task not found")
    task.status = status
}*/

class TaskService(private val source: DataSource) {
    fun findTaskByName(name: String): Task? = source.tasks.find { it.name == name }
    fun listByStatus(status: Status): List<Task> = source.tasks.filter { it.status == status }
    fun createTask(task: Task) {
        source.tasks.add(task)
    }

    fun updateTaskStatus(name: String, status: Status) {
        val task = findTaskByName(name) ?: throw Exception("Task not found")
        task.status = status
    }
}

/*Now that we only need to pass the data source when initializing an instance of the class, our job has become much easier. So, we have a dependency of the TaskService class on the DataSource class.*/
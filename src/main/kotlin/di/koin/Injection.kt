/*
package koin

import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.core.context.startKoin
import org.koin.core.module.dsl.factoryOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import org.koin.java.KoinJavaComponent.inject

*/
/*
val appModule = module {
    // components
}
module {
    factory<DataSource> { DataSource() }
    single<TaskService> { TaskService(get()) }
}

module {
    factoryOf(::DataSource)
    singleOf(::TaskService)
}

single<TaskService> { TaskService() }
factory<DataSource> { DataSource() }


startKoin {
    modules(module1, module2, ...)
}*/


/*class TaskService(private val source: DataSource) {
    fun findTaskByName(name: String, source: DataSource): Task? = source.tasks.find { it.name == name }

    fun listByStatus(status: Status, source: DataSource): List<Task> = source.tasks.filter { it.status == status }

    fun createTask(task: Task, source: DataSource) {
        source.tasks.add(task)
    }

    fun updateTaskStatus(name: String, status: Status, source: DataSource) {
        val task = findTaskByName(name, source) ?: throw Exception("Task not found")
        task.status = status
    }
}*//*
/*

class TaskService: KoinComponent {
    private val source1 by inject<DataSource>()
    // or in another style
    private val source2: DataSource by inject()
}


fun main() {
    val appModule = module {
        factory<DataSource> { DataSource() }
        single<TaskService> { TaskService() }
    }

    startKoin {
        modules(appModule)
    }

    // Lazy mode
    val service1 by inject<TaskService>(TaskService::class.java)

    // Eager mode
    val service2 = get<TaskService>(TaskService::class.java)

    module {
        factoryOf(::DataSource)
        singleOf(::TaskService)
    }


}*/
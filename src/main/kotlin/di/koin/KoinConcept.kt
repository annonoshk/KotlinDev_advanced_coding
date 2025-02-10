package di.koin


import io.ktor.http.*
import org.koin.core.component.KoinComponent
import org.koin.core.context.GlobalContext.startKoin
import org.koin.core.parameter.parametersOf
import org.koin.dsl.module
import org.koin.java.KoinJavaComponent.getKoin

import org.koin.java.KoinJavaComponent.inject

val appModule = module {
    // components/*
    // single: Each time we want to inject this component, Koin injects the same instance.
    // Roughly speaking, this is a kind of singleton that exists in a single instance for the entire program's lifetime.
    // The singleton cannot be deleted from Koin container. You can declare such a component like this:
    // */
    single<TaskService> { TaskService(get()) }
    /*
     * Each time we want to inject this component, Koin creates a new instance.
     * For example, we want a new DataSource instance to be created each time, independent of the others:
     */
    factory<DataSource> { DataSource() }
}
// same of above using DSL

/*
 *
module {
    factoryOf(::DataSource)
    singleOf(::TaskService)
}
*/

// Injecing dependencies
/*

startKoin {
    modules(module1, module2, ...)
}*/



fun main() {
    val appModule = module {
        factory<DataSource> { DataSource() }
        single<TaskService> { TaskService(get()) }
    }

    startKoin {
        modules(appModule)
    }

    // Lazy mode
    val service by inject<TaskService>(TaskService::class.java)

    // Or eager mode
    val service2 = getKoin().get<TaskService>()// get<TaskService>(TaskService::class.java)


    class TaskService : KoinComponent {  //to avoid injection twice
        //    private val source by inject<DataSource>(DataSource::class.java)

        //factory<DataSource> { params -> DataSource(params.get()) }


        private val source: DataSource by inject(DataSource::class.java) {
            parametersOf(
                listOf(
                    Task("Create DataSource", Status.DONE),
                    Task("Create TaskService", Status.ONGOING)
                )
            )
        }

        val appModule = module {
            factory<DataSource> { DataSource() }
            single<TaskService> { TaskService() }
        }
        //...
    }


}


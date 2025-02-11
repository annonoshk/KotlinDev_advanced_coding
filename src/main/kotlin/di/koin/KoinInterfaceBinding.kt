package di.koin


import org.koin.core.component.inject
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.factoryOf
import org.koin.core.parameter.parametersOf
import org.koin.core.qualifier.named
import org.koin.dsl.module
import org.koin.java.KoinJavaComponent.inject
import org.koin.core.module.Module // Import for Module
import org.koin.core.qualifier.named // Import for named
import org.koin.dsl.module // Import for the module DSL function
import org.koin.core.component.KoinComponent //If you are in a KoinComponent class

//import org.koin.core.inject //If you are in a KoinComponent class

interface DataSource1 {
    val tasks: MutableList<Task>
}

open class TaskService1 : KoinComponent {
    private val source: DataSource by inject()
    //   ...
}

class EmptyDataSourceImpl : DataSource1 {
    override val tasks: MutableList<Task> = mutableListOf()
}

class PreInitializedDataSourceImpl : DataSource1 {
    override val tasks: MutableList<Task> = mutableListOf(
        Task("Create DataSource", Status.DONE),
        Task("Create TaskService", Status.DONE),
        Task("Create Application", Status.ONGOING),
        Task("List tasks", Status.TODO),
    )
}

class TaskServiceImpl : TaskService1(), KoinComponent {
    val emptyDataSource = getKoin().get<DataSource1>(named<EmptyDataSourceImpl>())
    val preInitializedDataSourceImpl by inject<DataSource>(named<PreInitializedDataSourceImpl>())
    // ...
}

//fun main() {
// val service by inject<TaskService>(TaskService::class.java)

/*    val appModule = module {
        factory<DataSource1> { EmptyDataSourceImpl() }
        // Or we can choose another implementation
        // factory<DataSource> { PreInitializedDataSourceImpl() }
        //...
    }*/
/*    val appModule = module {
        factory<DataSource>(named<EmptyDataSourceImpl>()) { EmptyDataSourceImpl() }
        factory<DataSource>(named<PreInitializedDataSourceImpl>()) { PreInitializedDataSourceImpl() }
        //...
    }*/

/*    val appModule = module {
        factoryOf(::PreInitializedDataSourceImpl) {
            bind<DataSource>()
            named<PreInitializedDataSourceImpl>() // or named("preInitializedDataSourceImpl")
        }
        factoryOf(::EmptyDataSourceImpl) {
            bind<DataSource>()
            named<EmptyDataSourceImpl>()  // or named("emptyDataSourceImpl")
        }
        // ...
    }*/

// DSL
/*    val appModule = module {
        factoryOf(::EmptyDataSourceImpl) { bind<DataSource>() }
        // or
        // factoryOf(::PreInitializedDataSourceImpl) { bind<DataSource>() }
    }*/

// w/o lambda
/*    val appModule = module {
        factoryOf(::EmptyDataSourceImpl) bind DataSource::class
        // or
        // factoryOf(::PreInitializedDataSourceImpl) bind DataSource::class
    }*/
/*
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

        */
/*        val appModule = module {
                    factory<DataSource> { DataSource() }
                    single<TaskService> { TaskService() }
                }*//*

        //...
    }
}*/

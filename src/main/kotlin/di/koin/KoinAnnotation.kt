package di.koin

import org.koin.core.annotation.Named
import org.koin.core.annotation.Scope
import org.koin.core.annotation.Single
import org.koin.core.context.GlobalContext.startKoin
import org.koin.core.parameter.parametersOf
import org.koin.core.qualifier.named
import org.koin.java.KoinJavaComponent.inject
import org.koin.ksp.generated.*

@Single
class MyClass(val myDependency: MyDependency)

@Single
class MyClass(val myDependency: MyDependency) : MyInterface

@Single(binds = [MyInterface::class])
class MyClass(val myDependency: MyDependency) : MyInterface

@Single
class MyClass(val myDependency: MyDependency?)

@Single
@Named("MemoryStorage")
class MemoryStorage : Storage

@Single
@Named("DatabaseStorage")
class Databasestorage(private val logDao: LogDao) : Storage

val storage: Storage by inject(named("MemoryStorage"))

@Single
class MyClass(@InjectedParam val myDependency: MyDependency)

val m = MyDependency
// Resolve MyComponent while passing MyDependency
koin.get<MyClass> { parametersOf(m) }

@Single
class MemoryStorage : Storage

@Single
class Repository(val storage: Lazy<Storage>)

@Single
@Named("MemoryStorage")
class MemoryStorage : Storage

@Single
@Named("Databasestorage")
class Databasestorage(private val logDao: LogDao) : Storage

@Single
class Repository(val datasource: List<Storage>)

@Single
class MyClass(@Property("my_key") val myProperty: String)

startKoin {
    // Load properties from the default location
    // (i.e. `/src/main/resources/koin.properties`)
    fileProperties()
    // Load properties from the application.properties file
    // (i.e. `/src/main/resources/application.properties`)
    // fleProperties(./application.properties)
}

// scope by type
@Scope(MyScope::class)
class MyComponent

// scope by name
@Scope(name = "MyScopeName")
class MyComponent


fun main() {
    startKoin {
        defaultModule()
    }
}

// or

/*
fun main() {
    startKoin {
        modules(
          defaultModule
        )
    }
}
*/

@Module
class MyModule

// given
// class MyComponent(val myDependency : MyDependency)

@Module
class MyModule {

    @Single
    fun myComponent(myDependency: MyDependency) = MyComponent(myDependency)
}
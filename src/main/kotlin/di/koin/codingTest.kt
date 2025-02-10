package koin

/*import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.core.context.startKoin
import org.koin.core.module.dsl.factoryOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import org.koin.java.KoinJavaComponent.inject

class Car(val maxSpeed: Int)

factory<Car> { params -> Car(params.get()) *//* your code here *//* }

//factory<DataSource> { params -> DataSource(params.get()) }

interface Wallet
class UsdWallet: Wallet
class BtcWallet: Wallet

val appModule = module {
    // your code here
    factory<Wallet> = { BtcWallet }
}
 factoryOf(::BtcWallet) bind Wallet::class
val appModule = module {
    factory<DataSource> { EmptyDataSourceImpl() }
    // Alternatively, choose another implementation
    // factory<DataSource> { PreInitializedDataSourceImpl() }
    // ...
}*/

fun main() {
repeat(5) {
    println("Kotlin")
}
}
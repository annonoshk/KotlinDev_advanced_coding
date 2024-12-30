import kotlin.reflect.KMutableProperty
import kotlin.reflect.full.memberProperties
import kotlin.reflect.full.createInstance
import kotlin.reflect.KFunction
import kotlin.reflect.KFunction2

/*
data class Source(val name: String, val age: Int)
data class Target(var name: String? = null, var age: Int = 0)

val source = Source("John", 20)

val target = Target().apply {
    name = source.name
    age = source.age
}

fun <S : Any, T : Any> map(source: S, target: T) {
    val sourceProperties = source::class.memberProperties
    val targetProperties = target::class.memberProperties

    sourceProperties.forEach { sourceProperty ->
        targetProperties.find { it.name == sourceProperty.name }?.let { targetProperty ->
            if (targetProperty is KMutableProperty<*>) {
                targetProperty.setter.call(target, sourceProperty.getter.call(source))
            }
        }
    }
}*/
/*

fun foo(block: () -> Unit) {
    block()
}

object Singleton

fun <T : Any> singletonInstance(klass: KClass<T>): T? {
    return if (klass.objectInstance != null) klass.objectInstance else null
}
*/

/*
data class Source(val name: String, val age: Int)
data class Target(var name: String? = null, var age: Int = 0)

fun <S : Any, T : Any> map(source: S, target: T) {
    val sourceProperties = source::class.memberProperties
    val targetProperties = target::class.memberProperties

    sourceProperties.forEach { sourceProperty ->
        targetProperties.find { it.name == sourceProperty.name }?.let { targetProperty ->
            if (targetProperty is KMutableProperty<*>) {
                targetProperty.setter.call(target, sourceProperty.getter.call(source))
            }
        }
    }
}

*/




/*
fun main() {

    val stringClass = String::class
    val instance = stringClass.createInstance()
    println(instance.javaClass)

*/
/*    val source = Source("John", 20)
    val target = Target()

    val target2 = Source("John", 20)

    map(source, target)

    println(target)  // Target(name=John, age=20)
    println(target2)*//*

}
*/

class Greeter {
    fun greet(name: String) {
        println("Hello, $name!")
    }
}
fun callMethod(instance: Any, function: KFunction<*>, vararg args : Any) {
    function.call(instance, * args)
}

fun main() {
    val greeter = Greeter()
    callMethod(greeter, Greeter::greet, "John")
}


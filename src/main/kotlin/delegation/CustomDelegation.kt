package delegation

import kotlin.reflect.KProperty
import kotlin.properties.ReadOnlyProperty  // To use ReadOnlyProperty
import kotlin.properties.ReadWriteProperty // To use ReadWriteProperty

/*class Formatter {
    private var value: String = ""

    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return value
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        this.value = value.replace(Regex("[aeiouAEIOU]"), "").uppercase()
    }
}*/
/*

class AnotherExample {
    val stringProp: String by Delegate()
    fun foo(): String {
        return ""
    }
}
*/

/*class Delegate {
    private var curValue = ""

    operator fun getValue(thisRef: AnotherExample, property: KProperty<*>): String {
        println(thisRef.stringProp + thisRef.foo()) // thisRef allows us to access any member of the class: AnotherExample
        return curValue
    }
}*/
fun anonymousDelegate() = object : ReadWriteProperty<Any?, String> {
    var curValue = ""

    override fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return curValue
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        curValue = value
        println("The new value of ${property.name} is: $value")
    }
}

fun main() {
    val readOnlyString: String by anonymousDelegate()
    var readWriteString: String by anonymousDelegate()

    readWriteString = "Hello!" // The new value of readWriteString is: Hello!
}

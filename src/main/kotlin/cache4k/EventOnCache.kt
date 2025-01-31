package cache4k
import io.github.reactivecircus.cache4k.Cache

fun main() {
    val reactiveCache = Cache.Builder<Int, Person>()
        .eventListener { event ->
            println("onEvent: $event")
        }
        .build()

    reactiveCache.put(1, Person(1, "John", 20))
    reactiveCache.put(2, Person(2, "Jane", 30))
    reactiveCache.put(1, Person(3, "Mary", 40))
    reactiveCache.invalidate(1)
}


// onEvent: Created(key=1, value=Person(id=1, name=John, age=20))
// onEvent: Created(key=2, value=Person(id=2, name=Jane, age=30))
// onEvent: Updated(key=1, oldValue=Person(id=1, name=John, age=20), newValue=Person(id=3, name=Mary, age=40))
// onEvent: Removed(key=1, value=Person(id=3, name=Mary, age=40))
// onEvent: Removed(key=2, value=Person(id=2, name=Jane, age=30))
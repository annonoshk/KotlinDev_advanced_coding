package cache4k

import io.github.reactivecircus.cache4k.Cache
import kotlin.time.Duration.Companion.hours

data class Person(val key: Int, val name: String, val age: Int)

// Create a cache with a maximum size
val cacheInfinite = Cache.Builder<Int, Person>()
    .build()

// Entries expire 1 hour after access
val cacheWithExpiryAccess = Cache.Builder<Int, Person>()
    .expireAfterAccess(1.hours)
    .build()

// Entries expire 1 hour after write
val cacheWithExpiryWrite = Cache.Builder<Int, Person>()
    .expireAfterWrite(1.hours)
    .build()

// Size-based eviction
val cacheWithSizeBasedEviction = Cache.Builder<Int, Person>()
    .maximumCacheSize(100)
    .build()

// Size- and time-based evictions together
val cacheWithSizeAndTimeBasedEviction = Cache.Builder<Int, Person>()
    .maximumCacheSize(100)
    .expireAfterWrite(1.hours)
    .build()

fun main() {
    val cache = Cache.Builder<Int, Person>().build()

    // write to cache
    cache.put(1, Person(1, "John", 20))
    cache.put(2, Person(2, "Jane", 30))
    cache.put(3, Person(3, "Mary", 40))

    // read from cache
    cache.get(1)?.let { println(it) } ?: run { println("Not found") }
    // Person(id=1, name=John, age=20)

    // Overwrite existing entry
    cache.put(1, Person(1, "John", 21))
    cache.get(1)?.let { println(it) } ?: run { println("Not found") }
    // Person(id=1, name=John, age=21)
}
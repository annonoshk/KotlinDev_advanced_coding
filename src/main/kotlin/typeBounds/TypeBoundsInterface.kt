package typeBounds

import org.jetbrains.annotations.*;

/*
public interface Game<T> {
    public T save(T x);

    @NotNull
    public T load(@NotNull T x);
}

interface ArcadeGame<T1> : Game<T1> {
    override fun save(x: T1): T1

    override fun load(x: T1 & Any): T1 & Any // T1 is definitely non-nullable

 // override fun load(x: T1): T1
 // ^ This won't compile
}*/

fun <T : String?> elvisLike(first: T, second: T & Any): T & Any = first ?: second

fun main() {
    elvisLike<String>("", "123").length    // Compiles successfully and returns 0

    //elvisLike<String>("", null).length     // Compilation error: 'null' cannot be a value of a non-null type

    elvisLike<String?>(null, "123").length // Compiles successfully and returns 3

   // elvisLike<String?>(null, null).length  // Compilation error: 'null' cannot be a value of a non-null type
}
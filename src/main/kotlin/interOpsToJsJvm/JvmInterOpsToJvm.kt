package interOpsToJsJvm

/*
Nullability
Kotlin's type system distinguishes between nullable and non-nullable types. When calling Kotlin from Java, remember that Kotlin variables can't be null unless explicitly specified.

 // Kotlin
fun mightReturnNull(): String? = ...

 // Java
String value = KotlinClass.mightReturnNull();
if (value != null) {
    // Safe usage
} */


//Flatform Types

/*
 * // Kotlin
val javaObject: JavaClass = JavaClass()
val value = javaObject.methodThatMightReturnNull() // value is a platform type

 */

/*
Data Classes and Singletons
When accessing Kotlin data classes from Java, use the generated componentN() methods for destructuring. For singletons (object in Kotlin), use the INSTANCE field from Java.

 // Kotlin
data class User(val name: String, val age: Int)
object SingletonExample

  // Java
User user = new User("Alice", 30);
String name = user.component1();
SingletonExample instance = SingletonExample.INSTANCE;

*/

/*
 * Common Pitfalls
Inadvertently introducing nullability issues by ignoring platform types.

Misusing Kotlin singletons in Java, forgetting the INSTANCE field.

Overlooking the need for Java to handle default arguments in Kotlin functions.

Avoiding Pitfalls
Always check for null when dealing with platform types.

Familiarize yourself with the synthetic methods Kotlin generates for Java compatibility.

Use @JvmOverloads in Kotlin to generate overloads for Java callers.

By adhering to these practices, developers can leverage the strengths of both languages and avoid common interoperability pitfalls within multiplatform projects.
 Avoiding Pitfalls
Always check for null when dealing with platform types.

Familiarize yourself with the synthetic methods Kotlin generates for Java compatibility.

Use @JvmOverloads in Kotlin to generate overloads for Java callers.

By adhering to these practices, developers can leverage the strengths of both languages and avoid common interoperability pitfalls within multiplatform projects.*/


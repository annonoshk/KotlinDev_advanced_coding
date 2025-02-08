package interOpsToJsJvm

// Common Kotlin code
/*@JsExport
fun add(a: Int, b: Int): Int = a + b

fun main() {
    // JavaScript code calling Kotlin
    const result = kotlinModule . add (1, 2);
    console.log(result); // Outputs: 3
}*/

/*
Kotlin Multiplatform and JS Interop: A Real-World Web Application Example
Kotlin Multiplatform allows developers to share logic across platforms while still enabling them to write platform-specific code. In web applications, Kotlin can target JavaScript, and working with Kotlin and JavaScript together is a usual situation.

Calling JavaScript from Kotlin:
To call a JavaScript function from Kotlin, you must declare an external function. For example, let's say we have a JavaScript function to figure out the sum of two numbers:

function calculateSum(a, b) {
    return a + b;
}

In Kotlin, you would declare this function as:

 external fun calculateSum(a: Int, b: Int): Int

Now, you can call calculateSum from Kotlin as if it was a native Kotlin function:

fun main() {
    val result = calculateSum(5, 3)
    println(result) // Output: 8
}

Calling Kotlin from JavaScript:
To show Kotlin functions to JavaScript, you can use the @JsExport annotation. Look at the following Kotlin function:

@JsExport
fun multiplyNumbers(a: Int, b: Int): Int {
    return a * b
}

After turning the Kotlin code into JavaScript, you can call multiplyNumbers from your JavaScript code:

const result = myModule.multiplyNumbers(2, 4);
console.log(result); // Output: 8

The myModule variable is the generated JavaScript module from Kotlin compilation.

*/

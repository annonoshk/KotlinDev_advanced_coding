package recursion

fun m(x: Int, y: Int): Int {
    return if (x < y) {
      x
    } else {
      m(x - y, y)
    }
  }
fun factorial(n: Int): Int {
    var f = 1
    for (i in 1..n)
        f *= i
    return f
}
fun factorialRecursive(n: Int): Int = if (n == 0 || n == 1) 1 else n * factorialRecursive(n - 1)
fun weirdFactorialRecursive(n: Int): Int = if (n == 0 || n == 1) 1 else factorialCompute(n)

fun factorialCompute(n: Int): Int = n * weirdFactorialRecursive(n - 1)

fun tailFactorialRecursive(n: Int, cur: Int = 1): Int {
    if (n == 0) return cur
    return tailFactorialRecursive(n - 1, cur * n)
}

fun fibonacci(n: Int): Int {
    if (n <= 0) return 0
    if (n == 1) return 1
    return fibonacci(n - 1) + fibonacci(n - 2)
}

val fibList = MutableList(1000){0}

fun coolerFibonacci(n: Int): Int {
    if (n <= 0) return 0
    if (n == 1) return 1
    return if (fibList[n] != 0) fibList[n]
    else {
        fibList[n] = coolerFibonacci(n - 1) + coolerFibonacci(n - 2)
        fibList[n]
    }
}

fun fibonacciLoop(n: Int): Int {
    var n0 = 0
    var n1 = 1
    for (i in 1 until n) {
        val cur = n0 + n1
        n0 = n1
        n1 = cur
    }
    return n1
}
fun f(n: Int): Int = if (n > 2) f(n - 1) + f(n - 2) + f(n - 3) else n
fun main() {
  println(m(50,7))
  println(f(6))
}
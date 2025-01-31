package customException// Do not change the code below

open class BaseException : Exception()
open class MidException : BaseException()
class DerivedException : MidException()

fun main() {
    val exceptionList = listOf(DerivedException(), MidException(), BaseException())
    for (ex in exceptionList) {
        try {
            throw ex
        } catch (e: Exception) {
            when (e) {
                is DerivedException -> println("Caught a DerivedException!")
                is MidException -> println("Caught a MidException!")
                is BaseException -> println("Caught a BaseException!")
                else -> println("other exception")
            }
        }
    }
}
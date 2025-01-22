package thread

/*
 * Summing ranges with threads
The following code is supposed to find the general sum of two inclusive integer ranges in parallel.
Unfortunately, this code doesn't work correctly.
Try and fix it. Read the comments for a better understanding.

Additional explanations: the implemented class RangeSummator extends Thread and overrides the method run.
It sums the range passed to the constructor (left and right limits as integers).
The class has a field result that returns the calculated sum or 0 if the thread has not calculated the sum yet.

Sample Input 1:

1 5
2 4

Sample Output 1:

24
 */
// do not change the lines below until main()
val mainThreadId3 = Thread.currentThread().id

class RangeSummator(var fromIncl: Int, var toIncl: Int) : Thread() {
    @Volatile
    var result: Long = 0
        private set

    override fun run() {
        val currentId = currentThread().id
        if (currentId == mainThreadId3) {
            throw RuntimeException("You must start a new thread!")
        }
        var sum: Long = 0
        for (i in fromIncl..toIncl) {
            sum += i.toLong()
        }
        result = sum
    }
}
// Fix this function
fun main() {
    val (from1Incl, to1Incl) = readLine()!!.split(" ").map { it.toInt() } // limits of the first range
    val (from2Incl, to2Incl) = readLine()!!.split(" ").map { it.toInt() } // limits of the second range

    val summator1 = RangeSummator(from1Incl, to1Incl) // first summator
    summator1.start()
    summator1.join()
    val summator2 = RangeSummator(from2Incl, to2Incl) // second summator
    summator2.start()
    summator2.join()

    val partialSum1 = summator1.result
    val partialSum2 = summator2.result
    val sum = partialSum1 + partialSum2 // the sum is 0, fix it!
    println(sum)
}




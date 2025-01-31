package collections

/*
 * The secret code?
Ethan Hunt is ready for another "Mission: Impossible". To disable a nuclear warhead, you must type the correct combination. He only knows that the code is obtained in the following way: given a list of secret words, he must associate the first letter with the word length. Print the map that represents the combination that Ethan must use to disables the device.

Sample Input 1:

expetum axio alithigum

Sample Output 1:

{E=7, A=9}
 */
/* Do not change code below */
fun main() {
    val list = readln().split(" ")
    // write your code here
    val res = list.associate { it.first().uppercase() to it.length}


    println(res)
}
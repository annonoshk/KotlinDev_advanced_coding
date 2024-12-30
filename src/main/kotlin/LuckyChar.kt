
fun main() {
    val ticket = readln()!!

    if(ticket.length == 6 && ticket.all { it.isDigit()}) {
        val firstHalf = ticket.substring(0,3).map { it.digitToInt() }.sum()
        val lastHalf= ticket.substring(3,6).map {it.digitToInt()}.sum()
        if(firstHalf == lastHalf)
            println("Lucky")
        else
            println("Regular")
    }
    else
        println("Invalid numbers")
}

/*
    val intNum = mutableListOf<Int>()

    for (ch in inputString) {
        intNum.add(ch.digitToInt())
    }
    println(intNum)

    if(intNum[0] + intNum[1] + intNum[2] == intNum[3] + intNum[4] + intNum[5])
        println("Lucky")
    else
        println("Regular")

*/


//https://target.com/index.html?pass=12345&port=8080&cookie=&host=localhost

/*fun main() = readLine()!!.replace("=&", "=not found&").split('?')[1].split('&')
    .associate { it.split('=')[0] to it.split('=')[1] }.toMutableMap()
    .also { if ("pass" in it.keys) it["password"] = it["pass"]!! }
    .forEach { println("${it.key} : ${it.value}") }*/



fun main() {
    val input = readln()!!.split(" ")
    val inputStr = input[0]
    val Nth = input[1].toInt()

    val resultString = if (Nth >= inputStr.length)
        inputStr
     else
         inputStr.substring(Nth) + inputStr.substring(0,Nth)

    println(resultString)


}
/*
fun main() {
    val query = readln()!!.substringAfter('?')
    val params = query.split('&').associate {
        val keyValue = it.split("=")
        val key = keyValue[0]
        val value = if( keyValue[1].isNotEmpty() ) keyValue[1] else "not found"
        key to value
    }

    params.forEach { (key, value) ->
        println("$key: $value")
    }

    params["pass"]?.let {
        if(it != "not found")
            println("password: $it")
    }

    val str1 = "aaabbcccdaa"
    var str2 = " "

    for (ch in str1) {
        if (ch != str2.last()) {
            str2 += ch
        }
    }
    println(str2)
}*/

// Sample Input

// Sample Input
/*
val url = "https://target.com/index.html?pass=12345&port=8080&cookie=&host=localhost"
parseUrl(url)
?.let { if (it != "not found") { println("password : ${URLDecoder.decode(it, "UTF-8")}") } }*/

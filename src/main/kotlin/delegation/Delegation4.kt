package delegationinterface

interface MyInterface {
    fun print()
    var msg: String
}

class MyImplementation : MyInterface {
    override fun print() { println(msg) }
    override var msg: String = "To be, or not to be, that is the question:"

    fun updateMsg(newMsg: String) {
        if(newMsg != "")
            msg = newMsg
    }
}

class CharacterInfoFormatter(base: MyInterface) : MyInterface by base {

    var start: String = ""
    var end: String = ""

    override fun print() {
        println("$msg [${msg.length} characters]")  // Your code here
    }
}

fun main() {
    val line = readln()
    val a = MyImplementation()
    a.updateMsg(line)
    val delegate = CharacterInfoFormatter(a)

    delegate.print()
}
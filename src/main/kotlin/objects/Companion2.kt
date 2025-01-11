package objects

class Player4(val id: Int = 0, val name: String, val hp: Int = 100 ) {

    companion object {
        private var currentId = 0

        fun create(name: String): Player4 {
            currentId++
            return Player4(currentId, name)
        }
    }
}

fun main() {
    println(Player4.create("Huck Kim"))
}
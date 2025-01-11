package objects

class Player5(val id: Int, name: String) {
    companion object Properties {
        val defaultSpeed = 8
        val maxSpeed = 13

        fun calcMovePenalty(cell: Int): Int {
            return defaultSpeed - cell % 3
        }
    }
}

fun calculatePlayerSpeed(cell: Int): Int {
    return Player5.calcMovePenalty(cell)
}
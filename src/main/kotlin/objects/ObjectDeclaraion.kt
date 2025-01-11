package objects


class Player1(val name: String, val level: Int, val onLine: Boolean)

class Player(val id: Int, _name: Any?, _hp: Any?) {
    object Properties {
        /* Default player speed in playing field – 7 cells per turn */
        val defaultSpeed = 7

        fun calcMovePenalty(cell: Int): Int {
            return defaultSpeed - cell
        }
    }

    /* creates a new instance of Player */
/*    object Factory {
        fun create(playerId: Int): Player {
            return Player(playerId, _name, _hp)
        }
    }*/
}



object PlayingField1 {

    fun getAllPlayers(): Array<Player1> {
        /* ... */
        return arrayOf(Player1("Huck",100, false), Player1("Jeon",100,false ))
    }

    fun isPlayerInGame(player: Player1): Boolean {
        /* ... */return player.onLine
    }

}
fun startNewGameTurn() {
    val players = PlayingField1.getAllPlayers()
    if (players.size < 2) {
        return println("The game cannot be continued without players")
    }
    for (player in players) {
        nextPlayerTurn(player)
    }
}

fun nextPlayerTurn(player: Player1) {
    if (!PlayingField1.isPlayerInGame(player)) {
        return println("Current player lost. Next...")
    }
    /* Player actions here */
}

fun main() {
    startNewGameTurn()

    println(Player.Properties.defaultSpeed)

    /* prints 7 */

    /* prints 13 */
   // println(Player.Factory.create(13).id)
}
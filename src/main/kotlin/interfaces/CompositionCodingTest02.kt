package interfaces

interface Level {
    fun getLevel(): Int
}

interface Enemy {
    fun isEnemy(): Boolean
}

interface Class {
    fun getClass(): String
}

object HighLevelled : Level {
    override fun getLevel(): Int = 25
}

object LowLevelled : Level {
    override fun getLevel(): Int = 3
}

object Hostile : Enemy {
    override fun isEnemy(): Boolean = true
}

object Ally : Enemy {
    override fun isEnemy(): Boolean = false
}

object Cleric : Class {
    override fun getClass(): String = "Cleric"
}

object Barbarian : Class {
    override fun getClass(): String = "Barbarian"
}

// do not change the code above!

class HighLevelledAlliedCleric : Level by HighLevelled, Enemy by Ally, Class by Cleric// ?

class LowLevelledHostileBarbarian : Level by LowLevelled, Enemy by Hostile, Class by Barbarian // ?
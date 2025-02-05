package interfaces

interface FirstInterface {
    fun f() { print("First") }
    fun g() { print("not g") }
}

interface SecondInterface {
    fun f() { print("Second") }
    fun g() { print("g") }
}

class FirstClass : FirstInterface {
    override fun g() { print("g") }
}

class SecondClass : FirstInterface, SecondInterface {
    override fun f() { print("Class")}
    override fun g() {
        super<SecondInterface>.g()
    }

}

class ThirdClass : FirstInterface, SecondInterface {
    override fun f() {
        super<FirstInterface>.f()
        super<SecondInterface>.f()
    }

    override fun g() {
        super<SecondInterface>.g()
    }
}
/*
interface Level {
    fun getLevel(): Int
}

interface Enemy {
    fun isEnemy(): Boolean
}

interface Class {
    fun getClass(): String
}
*/


class DangerousEnemyWarrior : Level, Enemy, Class {
    override fun getLevel(): Int { return 10 }

    override fun isEnemy(): Boolean { return true }

    override fun getClass(): String { return "Warrior" }
}


// We only need to create all these objects once - That s why the delegation is created

object Dangerous : Level { override fun getLevel(): Int { return 10 } }

object NotDangerous : Level { override fun getLevel(): Int { return 1 } }

object Foe : Enemy { override fun isEnemy(): Boolean { return true } }

object Friend : Enemy { override fun isEnemy(): Boolean { return false } }

object Warrior : Class { override fun getClass(): String { return "Warrior"}}

object Wizard : Class { override fun getClass(): String { return "Wizard"}}

// And then we're free to use them as many times as we'd like!

class DangerousKotlinEnemyWarrior : Level by Dangerous, Enemy by Foe, Class by Warrior // Level is delegated by object Dangerous........

class NotDangerousFriendlyWizard : Level by NotDangerous, Enemy by Friend, Class by Wizard
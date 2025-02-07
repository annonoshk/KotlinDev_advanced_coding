package interfaces

interface Entity {
    var hp: Int
    var armorClass: Int
}

interface NPC : Entity {
    val xp: Int
    var location: String
}

interface Magical : Entity {
    var mana: Int
    var hasSpells: Boolean
}

interface Divine : Entity {
    var mana: Int
    var hasPowers: Boolean
}

interface Ranged : Entity {
    var usesAmmo: Boolean
    var ammoAmount: Int
    fun rangedAttack() {}
    fun retreat() {}
}

interface Melee : Entity {
    var amountOfWeapons: Int
    fun meleeAttack() {}
    fun meleeDodge() {}
    fun sheatheWeapon() {}
}

interface Healing {
    fun healAlly() {}
    fun healSelf() {}
    fun restoreMana() {}
}

interface Ghostly {
    val damageReduction: Int
    fun passThrough() {}
}

interface Flying : Entity {
    fun flyByAction() {}
    fun dash() {}
    fun wingShield() {}
}

class ValkyrieWarrior : Melee, Magical, Flying, Healing {
    override var amountOfWeapons: Int = 2
    override var hp: Int = 10
    override var mana: Int = 5
    override var hasSpells: Boolean = false
    override var armorClass: Int = 15

    override fun sheatheWeapon() {}
    override fun flyByAction() {}
    override fun meleeAttack() {}
    override fun healSelf() {}
    override fun healAlly() {} // Added to fulfill Healing interface
    override fun restoreMana() {} // Added to fulfill Healing interface
    override fun dash() {} // Added to fulfill Flying interface
    override fun wingShield() {} // Added to fulfill Flying interface
}

class PriestCompanion : NPC, Divine, Ranged, Healing {
    override var mana: Int = 15
    override var hasPowers: Boolean = true
    override val xp: Int = 100
    override var location: String = "Werforce"
    override var ammoAmount: Int = 0
    override var usesAmmo: Boolean = false
    override var hp: Int = 6
    override var armorClass: Int = 12

    override fun healAlly() {}
    override fun healSelf() {}
    override fun rangedAttack() {}
    override fun restoreMana() {} // Added to fulfill Healing interface
}
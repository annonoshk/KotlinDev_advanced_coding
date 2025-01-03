package delegationn


interface BonusCalculator {
    fun calculateBonus(spend: Double): Double
}

class FlatRateBonusCalculator(private val rate: Double) : BonusCalculator {
    override fun calculateBonus(spend: Double): Double {
        return (spend / 100.0).toInt() * rate
    }
}

class PercentageBonusCalculator(private val percentage: Double) : BonusCalculator {
    override fun calculateBonus(spend: Double): Double {
        return spend * percentage / 100.0
    }
}

class Customer(val name: String, bonusCalculator: BonusCalculator): BonusCalculator by bonusCalculator


fun main() {
    val rate = 4.4
    val bonusCalculatorFlat = FlatRateBonusCalculator(rate)

    val customer = Customer("Huck Kim", bonusCalculatorFlat)
    println(customer.calculateBonus(1000.0))
}


// make your code here
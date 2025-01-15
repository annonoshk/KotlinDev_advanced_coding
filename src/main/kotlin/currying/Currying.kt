package currying

fun calculateTotalPrice(price: Double): (Double) -> Double {
    return { discount -> price - (price * discount / 100) }
}

fun calculateDeliveryCost(weight: Double, distance: Double, type: String): Double {
    val baseCost = if (type == "standard") 5.0 else 10.0
    val weightCost = weight * 0.5
    val distanceCost = distance * 0.3
    return baseCost + weightCost + distanceCost
}

fun calculateDeliverCostCurrying(weight: Double): (Double) -> (String) -> Double {
    return { distance -> { type  ->
        val baseCost = if (type == "standard") 5.0 else 10.0
        val weightCost = weight * 0.5
        val distanceCost = distance * 0.3
        baseCost + weightCost + distanceCost
        }
    }

}
fun main() {
    val currying = calculateTotalPrice(100.0)
    println(currying(30.0))

    val calculateFor10KgAnd50Km = calculateDeliverCostCurrying(10.0)(50.0)
    println(calculateFor10KgAnd50Km("standard")) // Output: 35.0
    println(calculateFor10KgAnd50Km("express"))  // Output: 40.0

}
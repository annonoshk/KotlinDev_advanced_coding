package propertyAccessor


fun main() {
    val smartOne = Smartphone("Ericsong")
    smartOne.price = -24
    val smartTwo = Smartphone("iNokhe")
    println(smartOne.price)
    println(smartTwo.price)
    
    print(smartTwo.price - smartOne.price)
}

class Smartphone(val name: String) {
    var price: Int = -5
        get() = name.length - field
}
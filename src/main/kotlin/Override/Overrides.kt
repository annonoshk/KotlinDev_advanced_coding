package overrides.kt


fun getFurnitureInfo(furniture: Furniture): String {
    return "furniture info: " + furniture.getFullInfo()
}

open class Furniture(val cost: Int) {
    open fun getFullInfo(): String = "$$cost cost"

    // override fun getTax(): String = "$${(cost * 0.25).roundToInt()} tax"
}

/*override*/ fun getFullFurnitureInfo(furniture: Furniture): String {
  //  return "furniture info: " + furniture.getFullInfo() + furniture.getTax()
    return " "
}

open class Device(val type: String) {
    open fun getFullInfo(): String = "$type type"
}

open class InputDevice(type: String, val portsNumber: Int) : Device(type) {
    override fun getFullInfo(): String = "$portsNumber ports"
}

fun main() {
    val factory = FactoryWithRoof(3, 2, 23000)
    print(factory.employeesPerFloor())
    println(23000/8)
}

open class Facility(val floors: Byte) {
    fun addFloors(num: Byte): Int = floors + num
}

open class Factory(floors: Byte, val employees: Short, val roof: Byte) : Facility(floors) {
    fun buildRoof(): Int = super.addFloors(roof)
    open fun employeesPerFloor(): Int = employees / floors
}

open class FactoryWithRoof(floors: Byte, roof: Byte, employees: Short) : Factory(floors, employees, roof) {
    override fun employeesPerFloor(): Int = employees / (floors + super.buildRoof())
}
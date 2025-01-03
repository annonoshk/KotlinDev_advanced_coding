package delegation
interface IIndex {
    fun print()
    val index: Int
}

interface IValue {
    fun print()
    val value: Int
}

class IndexData(override val index: Int) : IIndex {
    override fun print() = print(index)
}

class ValueData(override val value: Int) : IValue {
    override fun print() = print(value)
}

fun getDateTime() = "03-05-2021-14:33"

class LogDataCollector(index: IIndex, value: IValue) : IIndex by index, IValue by value {
    override fun print() = print("[${getDateTime()}]: $index, $value")
}

fun main() {
    LogDataCollector(IndexData(5),ValueData(10)).print()
}
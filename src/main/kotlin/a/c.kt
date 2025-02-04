package a

open class Base(val num: Int, var isZero: Int = 0, val str: String = "Europe") {
    constructor(num: Int, str: String) : this(num, 0, str)
}


class Derived1 : Base {
    constructor(num: Int, isZero: Int, str: String) : super(num, isZero, str)
    constructor(num: Int, str: String) : super(num, str)
}

/*class Derived2 : Base() {
    constructor(num: Int, isZero: Int, str: String) : super(num, isZero, str)
    constructor(num: Int, str: String) : super(num, str)
}

class Derived3 : Base {
    constructor(val num: Int, var isZero: Int, val str: String) : super(num, isZero, str)
    constructor(num: Int, str: String) : super(num, str)
}
*/


class Derived4 : Base {
    constructor(num: Int) : super(num)
    constructor(num: Int, str: String) : super(num, str)
}
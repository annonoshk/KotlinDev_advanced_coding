package stringFormating


fun main() {
    val double1 = 1234.5678
    val double2 = -1234.5678

    println(String.format("%+.5G", double1))      //1.234568e+03
    println(String.format("%.4b", double2))      //-1.234568E+03
    println(String.format("% -(12f", double1))  //       1.23e+03
    println(String.format("%,e", double1))    //1.234567800E+03
}

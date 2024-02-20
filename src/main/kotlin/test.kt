package com.dicoding.kotlin
enum class Rainbow(val color : String) {
    RED("Red"),
    ORANGE("Orange"),
    YELLOW("Yellow"),
    GREEN("Green"),
    BLUE("Blue"),
    INDIGO("Indigo"),
    VIOLET("Violet")
}
// main function
fun main() {
//    fun sumNumbers(vararg number: Int): Int {
//        return number.sum()
//    }
//
//    print(sumNumbers(1,2,4))

//    var n = 14
//    when(n) {
//        11 -> print("B ajah")
//        12 -> print("Gacor")
//    }
//    val intRange = 10.downTo(1)
////    println(intRange.joinToString(", "))
//    for(i in intRange) {
//        if (i == 3) break
//        print("$i")
//
//    }
//    println()
//    val ranges = 1.rangeTo(10) step 3
//    ranges.forEach { value ->
//        println("value is $value!")
//    }
//    val x = 11
//    when (x) {
//        10, 11 -> print("a")
//        11, 12 -> print("b")
//    }
//
//    for (i in 1..3) {
//        for (j in 1..i) {
//            print("$j")
//        }
//    }
    val someString = "Dicoding"
    print(someString.reversed())

}

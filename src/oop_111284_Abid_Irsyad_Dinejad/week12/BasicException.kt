package oop_111284_Abid_Irsyad_Dinejad.week12

import java.text.NumberFormat

fun divide(a: Int, b: Int): Int {
    try {
        return a / b
    } catch (e: ArithmeticException) {
        println("Error: ${e.message}")
        return -1
    }finally {
        println("Division Attempt Finished")
    }
}
fun main() {
    println("=== Test Try As Expression ===")
    val inputString = "123A"

    val result: Int = try {
        Integer.parseInt(inputString)
    } catch (e: NumberFormatException) {
        -1
    }

    println("The result is $result")
}
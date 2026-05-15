package oop_111284_Abid_Irsyad_Dinejad.week12

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
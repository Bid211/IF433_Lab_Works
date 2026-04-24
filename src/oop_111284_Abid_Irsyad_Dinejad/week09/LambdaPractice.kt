package oop_111284_Abid_Irsyad_Dinejad.week09

fun main() {
    println("=== Test Lambda ===")

    val sumLambda = {a: Int, b: Int -> a + b}
    println("Sum Lambda: ${sumLambda(5, 10)}")

    val squareImplicit: (Int) -> Int = { it * it }
    println("Hasil Square: ${squareImplicit(4)}")

}
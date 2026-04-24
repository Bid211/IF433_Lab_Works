package oop_111284_Abid_Irsyad_Dinejad.week09

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8,)
    println("Original data: $numbers")
    println("\n=== HOF Filters ===")

    val evens = numbers.filter { it % 2 == 0 }
    println("evens only: $evens")

    println("\n=== HOF: Map ===")
    val multiplied = numbers.map { it * 10 }
    val asStrings = multiplied.map { "Rp ${it}K" }
    println("Multiplied: $multiplied")
    println("Formatted: $asStrings")

}
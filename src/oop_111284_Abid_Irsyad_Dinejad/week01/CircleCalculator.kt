package oop_111284_Abid_Irsyad_Dinejad.week01

fun main(args: Array<String>) {
    // Menggunakan val dan Type Inference (tanpa : Double)
    val radius = 7.0
    val pi = 3.14

    // Calculation
    val area = pi * radius * radius

    // String Template (menggunakan $variable)
    println("Radius: $radius, Area: $area")

    checkSize(area)
}

fun checkSize(area: Double) {
    if (area > 100) {
        println("This is a Big Circle")
    } else {
        println("This is a Small Circle")
    }
}
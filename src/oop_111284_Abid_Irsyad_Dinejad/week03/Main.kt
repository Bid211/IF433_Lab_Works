package oop_111284_Abid_Irsyad_Dinejad.week03

fun main() {
    val e = Employee("Budi")

    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()
    // tidak ada lagi
    println("Pajak yang harus dibayar: ${e.tax}")
}
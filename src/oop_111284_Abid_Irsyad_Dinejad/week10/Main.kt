package oop_111284_Abid_Irsyad_Dinejad.week10

fun main() {
    println("=== Test Generic Class ===")
    val intBox = Box(100)
    val stringBox = Box("Generics in Kotlin")

    println("Isi intBox is ${intBox.value}")
    println("Isi stringBox is ${stringBox.value}")

    println("\n=== Test Multiple Parameters ===")
    val itemPrice = PairBox("Bitcoin", 65000)
    println("Aset: ${itemPrice.key}, Harga: ${itemPrice.value} USD")

    println("\n=== Test Generic Functions ===")
    printData(3.14)
    val result = processData("Stale Coin")
    println("Hasil Proses: $result")

    println("\n=== Test Constraints ===")
    val math = MathBox(10.5, 20)
    println("Total: ${math.sum()}")
    println("Terbesar: ${getMax(45, 90)}")

}
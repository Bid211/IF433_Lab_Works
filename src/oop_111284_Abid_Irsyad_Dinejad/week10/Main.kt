package oop_111284_Abid_Irsyad_Dinejad.week10

fun main() {
    println("=== Test Generic Class ===")
    val intBox = Box(100)
    val stringBox = Box("Generics in Kotlin")

    println("Isi intBox is ${intBox.value}")
    println("Isi stringBox is ${stringBox.value}")
}
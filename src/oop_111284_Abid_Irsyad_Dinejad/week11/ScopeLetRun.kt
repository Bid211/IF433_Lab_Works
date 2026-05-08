package oop_111284_Abid_Irsyad_Dinejad.week11

fun main() {
    println("=== Test Let Function ===")
    val name: String? = "Alexander"

    val length = name?.let {
        println("Nama terdeteksi: $it")
        it.length
    }
    println("Length: $length")
}
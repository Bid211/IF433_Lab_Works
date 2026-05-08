package oop_111284_Abid_Irsyad_Dinejad.week11

fun main() {
    println("=== Test Extension Function ===")
    println("Alex".addGreeting())
    println("Hi".repeatTimes(3))

    val text: String? = null
    println("Apakah Null/empty? ${text.isNullOrEmptyCustom()}")

    println("\n=== Test Run Function ===")
    val result = "Kotlin".run {
        println("Memproses kata: ${this}")
        length * 2
    }
    println("Hasil kalkulasi run: $result")
}
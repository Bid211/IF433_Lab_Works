package oop_111284_Abid_Irsyad_Dinejad.week01

fun main() {
    val name = "Kotlin"
    val score = 80

    println("Nama:  $name,  Nilai:  $score")
}

    val grade = calculateStatus(score)
    println("Grade kamu: $grade")
    }

    fun calculateStatus(score: Int) = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
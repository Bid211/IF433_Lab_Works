package oop_111284_Abid_Irsyad_Dinejad.week09

fun main() {
    println("=== Test List ===")
    val frameworks: List<String> = listOf("Kotlin", "Java", "C++")
    println("Immutable List: $frameworks")

    val scores: MutableList<Int> = mutableListOf(85, 90)
    scores.add(95)
    scores[0] = 88
    println("Mutable List: $scores")

    println("\n=== Test List ===")
    val uniqueNumber = setOf(1, 2, 2, 3, 3, 4)
    println(" Unique Number (set): $uniqueNumber")

    val activeUsers = mutableSetOf("UserA", "UserB")
    activeUsers.add("UserC")
    activeUsers.add("UserA")
    println("Active Users: $activeUsers")
}
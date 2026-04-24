package oop_111284_Abid_Irsyad_Dinejad.week09

data class Student(val name: String, val gpa: Double)

fun main() {
    val students = listOf(
        Student("John Smith", 3.2),
        Student("John Thor", 3.9),
        Student("John Williams", 2.6),
        Student("Keith Mcgregor", 1.6)
    )
}
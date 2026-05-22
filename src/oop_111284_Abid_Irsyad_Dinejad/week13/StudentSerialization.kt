package oop_111284_Abid_Irsyad_Dinejad.week13

import java.io.File
import java.io.FileNotFoundException

data class Student(var name: String, val age: Int, val gpa: Double)

fun Student.tocsv(): String = "$name, $age, $gpa"

fun fromCsv(line: String): Student {
    val parts = line.split(",")
    return Student(parts[0], parts[1].toInt(), parts[2].toDouble())
}

fun saveStudent(students: List<Student>, path: String) {
    File(path).writeText(students.joinToString("\n") { it.tocsv() })
}

fun loadStudents(path: String): List<Student> {
    return try {
        File(path).readLines().map { fromCsv(it) }
    } catch (e: FileNotFoundException) {
        println("Error: File tidak ditemukan!")
        emptyList()
    }
}

fun main(){
    val students = listOf(
        Student("Alice", 20, 3.8),
        Student("Bob", 22, 3.5)
    )
    saveStudent(students, "students.csv")

    val loaded = loadStudents("students.csv")
    println("=== Loaded Student Data ===")
    loaded.forEach { println(it) }
}
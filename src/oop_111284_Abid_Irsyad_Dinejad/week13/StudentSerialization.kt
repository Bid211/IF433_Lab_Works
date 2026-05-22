package oop_111284_Abid_Irsyad_Dinejad.week13

import java.io.File
import java.io.FileNotFoundException

data class Student(var name: String, val age: Int, val gpa: Double)

fun Student.tocsv(): String = "$name, $age, $gpa"

fun fromCsv(line: String): Student {
    val parts = line.split(",")
    return Student(parts[0], parts[1].toInt(), parts[2].toDouble())
}
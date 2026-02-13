package oop_001_johnthor.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")
    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (5 karakter): ")
    val nim = scanner.nextLine()

    println("Pilih Jalur Pendaftaran:")
    println("1. Reguler (Dengan Jurusan)")
    println("2. Belum Pilih Jurusan")
    print("Pilihan: ")
    val path = scanner.nextInt()
    scanner.nextLine()

    val student: Student

    if (path == 1) {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()
        student = Student(name, nim, major)
    } else {
        student = Student(name, nim)
    }

    println("\n--- HASIL PENDAFTARAN ---")
    println("Nama    : ${student.name}")
    println("NIM     : ${student.nim}")
    println("Jurusan : ${student.major}")
    println("GPA     : ${student.gpa}")
}
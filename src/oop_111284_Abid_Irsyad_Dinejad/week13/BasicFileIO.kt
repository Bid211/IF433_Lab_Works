package oop_111284_Abid_Irsyad_Dinejad.week13

import java.io.File

fun main() {
    println("=== Test Write Text ===")
    val file: File = File("notes.txt")
    file.writeText("Line 1: Sistem Inisialisasi. \n")
    println("File berhasil dibuat dan ditulis")

    file.appendText("Line 2 : Menambakan Konfigurasi Baru. \n")
    println("Teks Berhasil di-append")

}


package oop_111284_Abid_Irsyad_Dinejad.week13

import java.io.File
import java.io.FileWriter

fun main() {
    println("=== Test Unsafe Resource Handling ===")
    val unsafeFile = File("unsafe_logs.txt")
    val writer = unsafeFile.printWriter()

    writer.println("Log 1: Membuka Koneksi Databae.....")
    writer.println("Log 2: Menulis Data Pengguna.....")

    writer.close()
    println("Proses Penulisan Unsafe Selesai")
}
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

    println("\n=== Test Safe Resource Handling ===")
    val safeFile = File("safe_logs.txt")

    safeFile.printWriter().use { out ->
        for (i in 1..100) {
        out.println("Safe Log entry #$i: System Status OK.")
        }
    }
    println("100 baris log berhasil di generate dengan aman")

    println("\n=== Test Buffered Reader ===")

    safeFile.bufferedReader().use { reader ->
        reader.lineSequence().take(5).forEach { line ->
            println("Steam ReadL $line")
        }
    }
}
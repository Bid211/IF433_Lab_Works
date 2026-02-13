package oop_111284_Abid_Irsyad_Dinejad.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("--- Sistem Perpustakaan ---")
    print("Judul Buku: ")
    val title = scanner.nextLine()
    print("Peminjam: ")
    val borrower = scanner.nextLine()
    print("Lama Pinjam (hari): ")
    var duration = scanner.nextInt()

    // Validasi minus
    if (duration < 0) {
        println("Input tidak valid. Durasi diubah ke 1 hari.")
        duration = 1
    }

    val loan = Loan(title, borrower, duration)
    println("Denda Total: Rp ${loan.calculateFine()}")
}
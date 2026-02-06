package oop_111284_Abid_Irsyad_Dinejad.week01


fun main() {
    val gameTitle = "Elden Ring"
    val price = 650000

    val userNote: String? = null

    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    printReceipt(title = gameTitle, finalPrice = finalPrice, note = userNote)
}

fun calculateDiscount(price: Int): Int = if (price > 500000) (price * 0.2).toInt() else (price * 0.1).toInt()

fun printReceipt(title: String, finalPrice: Int, note: String?) {
    println("=== STEAMKW RECEIPT ===")
    println("Game: $title")
    println("Harga Akhir: Rp $finalPrice")


    println("Catatan: ${note ?: "Tidak ada catatan"}")

    println("========================")
}
package oop_111284_Abid_Irsyad_Dinejad.week01


fun main() {
    val gameTitle = "Elden Ring"
    val price = 650000
    val discount = calculateDiscount(price)
    val finalPrice = price - discount
}

fun calculateDiscount(price: Int): Int = if (price > 500000) (price * 0.2).toInt() else (price * 0.1).toInt()
package oop_111284_Abid_Irsyad_Dinejad.week08.Mandiri

sealed class Product

data class Electronic(
    val id: String,
    val name: String,
    val warrantyMonths: Int
) : Product()

data class Clothing(
    val id: String,
    val name: String,
    val size: String
) : Product()


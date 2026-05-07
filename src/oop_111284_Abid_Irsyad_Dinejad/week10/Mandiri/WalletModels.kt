package oop_111284_Abid_Irsyad_Dinejad.week10.Mandiri

interface Named {
    val name: String
}

data class Coin(override val name: String, val balance: Double) : Named

data class Transaction(val id: String, val amount: Double)
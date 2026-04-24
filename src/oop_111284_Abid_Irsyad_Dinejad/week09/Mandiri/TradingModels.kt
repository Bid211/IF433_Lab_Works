package oop_111284_Abid_Irsyad_Dinejad.week09.Mandiri

data class TradeLog(
    val pair: String,
    val position: String,
    val leverage: Int,
    val roe: Double,
    val status: String
)
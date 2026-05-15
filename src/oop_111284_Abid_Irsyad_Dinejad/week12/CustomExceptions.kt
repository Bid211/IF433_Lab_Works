package oop_111284_Abid_Irsyad_Dinejad.week12

class InsufficientCapacityException(
    val amount: Double,
    val balance: Double
) : Exception("Amount is $amount, balance is $balance")
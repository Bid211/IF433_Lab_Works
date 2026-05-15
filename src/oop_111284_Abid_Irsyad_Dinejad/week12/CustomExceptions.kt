package oop_111284_Abid_Irsyad_Dinejad.week12

class InsufficientCapacityException(
    val amount: Double,
    val balance: Double
) : Exception("Amount is $amount, balance is $balance")

class BankAccount(var balance: Double) {
    fun withdraw(amount: Double) {
        if (amount < 0) {
            throw IllegalArgumentException("The amount must be positive.")
        }
        if (amount > balance) {
            throw InsufficientCapacityException(amount, balance)
        }
        balance -= amount
        println("The balance is $balance")
    }
}
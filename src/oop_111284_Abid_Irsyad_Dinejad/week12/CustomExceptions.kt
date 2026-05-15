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

fun main() {
    println("=== Test Multiple Catch ===")
    val account = BankAccount(100.0)

    try{
        account.withdraw(150.0)
    } catch (e: InsufficientCapacityException) {
        println("Caught Domain Error: Uang tidak cukup. ${e.message}")
    } catch (e: IllegalArgumentException) {
        println("Caught Argument Error: Intput Tidak Valid ${e.message}")
    } catch (e: Exception) {
        println("Caught Genera Error: Terjadi Kesalahan tidak terduga")
    }
}
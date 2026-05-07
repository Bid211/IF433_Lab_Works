package oop_111284_Abid_Irsyad_Dinejad.week10.Mandiri

fun main() {
    val coinRepo = WalletRepository<Coin>()
    println("--- Crypto Dashboard Initialized ---")

    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 4.2))
    coinRepo.add(Coin("USDT", 1000.0))
    println("Coins added to repository.")

    val response = ApiResponse("200 OK", coinRepo.getAll())
    println("Network Response Created: Status ${response.status}")

    println("\n--- My Crypto Assets ---")
    println("Status: ${response.status}")
    response.data.forEach { coin ->
        println("Coin: ${coin.name}, Balance: ${coin.balance}")
    }
    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX001", 0.05))
    txRepo.add(Transaction("TX002", 150.0))
    txRepo.add(Transaction("TX003", 20.0))
    println("\nTransactions added: ${txRepo.getAll().size} records.")

}

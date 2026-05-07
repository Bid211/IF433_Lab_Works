package oop_111284_Abid_Irsyad_Dinejad.week10.Mandiri

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.5234))
    coinRepo.add(Coin("ETH", 12.5))
    coinRepo.add(Coin("USDT", 1500.0))

    val coinResponse = ApiResponse("200 OK", coinRepo.getAll())

    println("=== CRYPTO DASHBOARD ===")
    println("Status: ${coinResponse.status}")
    coinResponse.data.forEach { coin ->
        println("Asset: ${coin.name} | Balance: ${coin.balance}")
    }

    println("\n" + "=".repeat(25) + "\n")

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX-9901", 0.015))
    txRepo.add(Transaction("TX-9902", 2.0))

    val txResponse = ApiResponse("200 OK", txRepo.getAll())

    println("=== TRANSACTION HISTORY ===")
    println("Status: ${txResponse.status}")
    txResponse.data.forEach { tx ->
        println("ID: ${tx.id} | Amount: ${tx.amount}")
    }

    println("\n=== SEARCH RESULT (BTC) ===")
    val btcOnly = coinRepo.search { it.name == "BTC" }
    println(btcOnly)
}
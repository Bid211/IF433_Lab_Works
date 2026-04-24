package oop_111284_Abid_Irsyad_Dinejad.week09.Mandiri

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 5, 12.0, "OPEN"),
        TradeLog("BTCUSDT", "SHORT", 10, -2.5, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 20, 25.0, "CLOSED"),
        TradeLog("DOGEUSDT", "SHORT", 5, -8.0, "OPEN")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }

    val winningTrades = closedTrades.filter { it.roe > 0 }

    val losingTrades = closedTrades.filter { it.roe <= 0 }

    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }

    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map { "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)" }

    val uniquePairs = tradeHistory.map { it.pair }.toSet()

    println("=== CRYPTO TRADING DASHBOARD ===")
    topPerformersString.forEach { println(it) }

    worstPerformersString.forEach { println(it) }

    println("-------------------------------")
    println("Unique Traded Pairs: $uniquePairs")

}

// === CRYPTO TRADING DASHBOARD ===
//WIN [ETHUSDT - LONG]: +25.0% ROE (Lev: 20x)
//WIN [BTCUSDT - LONG]: +15.5% ROE (Lev: 20x)
//LOSS [ETHUSDT - SHORT]: -5.2% ROE (Lev: 10x)
//LOSS [BTCUSDT - SHORT]: -2.5% ROE (Lev: 10x)
//-------------------------------
//Unique Traded Pairs: [BTCUSDT, ETHUSDT, SOLUSDT, DOGEUSDT]
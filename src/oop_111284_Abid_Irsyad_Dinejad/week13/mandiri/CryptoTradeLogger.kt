package oop_111284_Abid_Irsyad_Dinejad.week13.mandiri

import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(
    val id: Int,
    val symbol: String,
    val type: String,
    val margin: Double,
    val pnl: Double
)

fun TradeRecord.toCsv(): String {
    return "$id,$symbol,$type,$margin,$pnl"
}

fun fromCsvTrade(line: String): TradeRecord? {
    return try {
        val parts = line.split(",")
        TradeRecord(
            id = parts[0].toInt(),
            symbol = parts[1],
            type = parts[2],
            margin = parts[3].toDouble(),
            pnl = parts[4].toDouble()
        )
    } catch (e: Exception) {
        println("(Log) Data korup diabaikan: $line")
        null
    }
}

fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { out ->
        trades.forEach { trade ->
            out.println(trade.toCsv())
        }
    }
}

fun loadTrades(path: String): List<TradeRecord> {
    return try {
        File(path).readLines().mapNotNull { fromCsvTrade(it) }
    } catch (e: FileNotFoundException) {
        println("Error: File tidak ditemukan!")
        emptyList()
    }
}

fun main() {
    val trades = listOf(
        TradeRecord(1, "BTCUSDT", "Long", 1000.0, 150.5),
        TradeRecord(2, "ETHUSDT", "Short", 500.0, -45.25),
        TradeRecord(3, "SOLUSDT", "Long", 750.0, 89.0)
    )
    saveTrades(trades, "crypto_trades.csv")
    println(">> Data trade simulasi berhasil disimpan ke crypto_trades.csv")

    File("crypto_trades.csv").appendText("CORRUPT_ID,DOGEUSDT,Hold,XX,YY\n")
    println(">> Baris kotor (malformed) sengaja di-inject ke file untuk testing robustness.")

    val loadedData = loadTrades("crypto_trades.csv")
    val totalPnl = loadedData.sumOf { it.pnl }

    println("\n=== DAFTAR TRADE YANG VALID ===")
    loadedData.forEach { trade ->
        println("ID: ${trade.id} | Symbol: ${trade.symbol} | Type: ${trade.type} | Margin: ${trade.margin} | PnL: ${trade.pnl}")
    }

    println("\n==== TOTAL PnL BERSIH: $$totalPnl ====")
}





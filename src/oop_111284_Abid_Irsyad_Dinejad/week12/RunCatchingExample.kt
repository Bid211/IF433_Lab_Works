package oop_111284_Abid_Irsyad_Dinejad.week12

fun main() {
    println("=== Test Runcatching Example ===")
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }
    val safeValue = result.getOrElse { - 1 }
    println("Safe Value: $safeValue")

    val recovered = result.recover { 0 }.getOrNull()
    println("Recovered Value: $recovered")

    runCatching {
        "100".toInt()
    }.onSuccess { v ->
        println("Berhasil Dikonversi: $v")
    }.onFailure { e ->
        println("Gagal konversi: ${e.message}")
    }
}
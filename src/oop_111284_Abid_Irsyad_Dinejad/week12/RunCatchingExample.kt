package oop_111284_Abid_Irsyad_Dinejad.week12

fun main() {
    println("=== Test Runcatching Example ===")
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }
}
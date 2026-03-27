package oop_111284_Abid_Irsyad_Dinejad.week07

fun main() {
    println("=== TEST Single ===")
    println("Status ${DatabaseManager.connetionStatus}")
    DatabaseManager.connect()

    println("\n === Test Object ===")
    val client = NetworkClient.createClient()
    client.connect()
}
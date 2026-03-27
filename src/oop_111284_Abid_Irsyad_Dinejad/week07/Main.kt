package oop_111284_Abid_Irsyad_Dinejad.week07

fun main() {
    println("=== TEST Single ===")
    println("Status ${DatabaseManager.connetionStatus}")
    DatabaseManager.connect()

    println("\n === Test Object ===")
    val client = NetworkClient.createClient()
    client.connect()


    println("\n=== Test Regular class ===")
    val reg1 = RegularUser("Alice", 29)
    val reg2 = RegularUser("Alice", 29)
    println(reg1)
    println("Sama ${reg1 == reg2}")

    println("\n=== Test Data class ===")
    val data1 = DataUser("Alice", 29)
    val data2 = DataUser("Alice", 29)
    println(data1)
    println("Sama ${data1 == data2}")
}


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

    val data3 = data1.copy(age = 28)
    println("Hasil copy: $data3")

    val (userName, userAge) = data1
    println("Destructured: $userName berumur $userAge")

    println("\n=== Test Sealed Class ===")
    val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik")

    val uiMessage = when(response) {
        is ApiResponse.Success -> "Tampilkan: ${response.data}"
        is ApiResponse.Failure -> "Tampilkan: ${response.message}"
        is  ApiResponse.Loading -> "Tampilkan Spinner"
    }
}


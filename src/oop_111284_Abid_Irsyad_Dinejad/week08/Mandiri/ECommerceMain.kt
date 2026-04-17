package oop_111284_Abid_Irsyad_Dinejad.week08.Mandiri

fun main() {
    val parser = ApiParser()

    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"), // Corrupted warranty
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"), // Missing ID!
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD") // Unknown type
    )

    println("=== MEMULAI PROSES BATCH ===")

    for (raw in rawApiData) {
        try {
            val product = parser.parseProduct(raw)

            product?.let { validProduct ->
                parser.checkout(validProduct)
            } ?: println("Data dilewati: Tipe produk tidak dikenali atau NULL")

        } catch (e: IllegalArgumentException) {
            println("WARNING: Data Korup terdeteksi - ${e.message}")
        }
    }

    println("=== PROSES SELESAI ===")


    // === MEMULAI PROSES BATCH ===
    //Checkout Sukses: TRX-E01-SUCCESS untuk produk Electronic
    //Checkout Sukses: TRX-C01-SUCCESS untuk produk Clothing
    //Checkout Sukses: TRX-E02-SUCCESS untuk produk Electronic
    //WARNING: Data Korup terdeteksi - API Invalid: Missing ID
    //Data dilewati: Tipe produk tidak dikenali atau NULL
    //=== PROSES SELESAI ===
}
package oop_111284_Abid_Irsyad_Dinejad.week08.Mandiri

class ApiParser {

    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        val id = requireNotNull(rawJson["id"]) { "API Invalid: Missing ID" }
        val name = requireNotNull(rawJson["name"]) { "API Invalid: Missing Name" }

        val type = rawJson["type"] as? String ?: return null
        return when (type) {
            "ELECTRONIC" -> {
                val warranty = rawJson["warranty"] as? Int ?: 12
                Electronic(id, name, warranty)
            }
            "CLOTHING" -> {

                val size = rawJson["size"] as? String ?: "All Size"
                Clothing(id, name, size)
            }
            else -> null
        }
    }

    fun checkout(product: Product) {
        val productId = when (product) {
            is Electronic -> product.id
            is Clothing -> product.id
        }

        val transactionId = JavaPaymentService.processPayment(productId)!!
        println("Checkout Sukses: $transactionId untuk produk ${product::class.simpleName}")
    }
}


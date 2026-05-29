package oop_111284_Abid_Irsyad_Dinejad.week14.mandiri

import java.io.File

class CsvOrderRepository(private val filePath: String = "orders.csv") : OrderRepository {
    private val file = File(filePath)

    init {
        if (!file.exists()) {
            file.createNewFile()
        }
    }

    override fun saveOrder(itemName: String, finalPrice: Double, customerType: String) {
        file.bufferedWriter().use { writer ->
            writer.appendLine("$itemName,$finalPrice,$customerType")
        }
    }
}

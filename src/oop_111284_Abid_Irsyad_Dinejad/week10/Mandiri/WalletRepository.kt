package oop_111284_Abid_Irsyad_Dinejad.week10.Mandiri

class WalletRepository {
    private val items = mutableListOf()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List {
        return items.toList()
    }
}
fun <T : Named> WalletRepository.findByName(targetName: String): List {
    return getAll().filter { it.name == targetName } // Ini chekpoint 14
}
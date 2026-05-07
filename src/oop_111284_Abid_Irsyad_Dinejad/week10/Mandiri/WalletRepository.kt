package oop_111284_Abid_Irsyad_Dinejad.week10.Mandiri

class WalletRepository<T : Any> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> = items

    fun search(predicate: (T) -> Boolean): List<T> {
        return items.filter(predicate)
    }
}
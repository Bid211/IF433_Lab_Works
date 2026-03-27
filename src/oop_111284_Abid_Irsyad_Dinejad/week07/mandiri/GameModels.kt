package oop_111284_Abid_Irsyad_Dinejad.week07.mandiri

enum class ItemRarity(val dropChance: Int) {
    COMMON(70),
    UNCOMMON(20),
    RARE(7),
    EPIC(2),
    LEGENDARY(1)
}
data class GameItem(val name: String, val damage: Int, val rarity: ItemRarity)
package oop_111284_Abid_Irsyad_Dinejad.week07.mandiri

class Weapon private constructor(val item: GameItem, val durability: Int) {

    companion object {
        fun forgeStarterSword(): Weapon {
            val starterItem = GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON)
            return Weapon(starterItem, 50)
        }

        fun forgeEpicSword(): Weapon {
            val epicItem = GameItem("Excalibur Palsu", 50, ItemRarity.EPIC)
            return Weapon(epicItem, 100)
        }
    }
}
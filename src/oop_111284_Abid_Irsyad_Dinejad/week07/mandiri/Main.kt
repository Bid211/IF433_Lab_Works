package oop_111284_Abid_Irsyad_Dinejad.week07.mandiri


fun main() {
    println("=== TEST SINGLETON ===")
    GameManager.startGame()
    GameManager.startGame()

    println("\n=== TEST FACTORY & ENUM ===")
    println("Drop Chance Legendary: ${ItemRarity.LEGENDARY.dropChance}%")

    val starterWeapon = Weapon.forgeStarterSword()
    println("Senjata Awal: ${starterWeapon.item}")

}
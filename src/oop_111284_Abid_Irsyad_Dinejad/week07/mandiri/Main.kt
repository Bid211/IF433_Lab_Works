package oop_111284_Abid_Irsyad_Dinejad.week07.mandiri


fun main() {
    println("=== TEST SINGLETON ===")
    GameManager.startGame()
    GameManager.startGame()

    println("\n=== TEST FACTORY & ENUM ===")
    println("Drop Chance Legendary: ${ItemRarity.LEGENDARY.dropChance}%")

    val starterWeapon = Weapon.forgeStarterSword()
    println("Senjata Awal: ${starterWeapon.item}")

    println("\n=== TEST COPY & EVENTS ===")
    val upgradedWeapon = starterWeapon.item.copy(damage = 25, name = "Pedang Kayu Bapuk Upgrade")

    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(upgradedWeapon)) // Masukkan item hasil copy
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}
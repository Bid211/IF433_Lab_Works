package oop_111284_Abid_Irsyad_Dinejad.week03

fun main() {

    println("=== WEAPON SYSTEM ===")

    val weapon = Weapon("Excalibur")

    println("Mencoba set damage -50:")
    weapon.damage = -50
    println("Damage saat ini: ${weapon.damage}")
    println()

    println("Mencoba set damage 9999:")
    weapon.damage = 9999
    println("Damage saat ini: ${weapon.damage}")
    println()

    println("Nama Senjata: ${weapon.name}")
    println("Tier Senjata: ${weapon.tier}")
    println("---------------------------------------------------\n")

    println("=== PLAYER LEVELING ===")

    val player = Player("KnightAlpha")

    println("Username: ${player.username}")
    println("Level Awal: ${player.level} (XP default: 0)")
    println()

    println("Menambah XP 50...")
    player.addXp(50)
    println("Level saat ini: ${player.level}")
    println()

    println("Menambah XP 60...")
    player.addXp(60)
    println("Level saat ini: ${player.level}")
    println("---------------------------------------------------")
}

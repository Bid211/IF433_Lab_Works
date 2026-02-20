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
}

package oop_111284_Abid_Irsyad_Dinejad.week03

class Weapon(val name: String) {
    var damage: Int = 0
        set(value) {
            if (value < 0) {
                println("Peringatan: Damage tidak boleh negatif! Nilai tetap ${field}")
                return
            }
            else if (value > 1000) {
                println("Peringatan: Damage maksimal adalah 1000! Nilai dipaksa menjadi 1000.")
                field = 1000
            }
            else {
                field = value
            }
        }

    val tier: String
        get() {
            return when {
                damage > 800 -> "Legendary"
                damage > 500 -> "Epic"
                else -> "Common"
            }
        }
}
package oop_111284_Abid_Irsyad_Dinejad.week03

class Player(val username: String) {

    private var xp: Int = 0

    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount > 0) {
            val levelSebelumnya = level
            xp += amount

            if (level > levelSebelumnya) {
                println("Level Up! Selamat $username naik ke level $level")
            }
        }
    }
}

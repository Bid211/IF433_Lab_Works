package oop_111284_Abid_Irsyad_Dinejad.week03

class Employee(val name: String) {
        var salary: Int = 0
            set(value) {
                if (value < 0) {
                    println("Error: Gaji tidak boleh kosong atau negativ!")
                    field = 0
                } else {
                    field = value
                }

            }
        private var performanceRating: Int = 0

        fun increasePerformance() {
            performanceRating++
            println("Kinerja $name Meningkat! Rating: $performanceRating")
        }

    fun printStatus() {
        println("Karyawan: $name, Rating: $performanceRating")
    }
    val tax: Double
        get() = salary *0.1
}

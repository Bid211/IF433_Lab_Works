package oop_111284_Abid_Irsyad_Dinejad.week11

data class User(var name: String = "", var age: Int = 0)

fun main() {
    println("=== Test Apply ===")
    val user = User().apply {
        name = "Jack"
        age = 30
    }
    println(user)

    println("=== Test Also ===")
    val numbers = mutableListOf(1, 2, 3)
    numbers.also {
        println("Log Sebelum Ditambah: $it")
    }.add(4)
    println("Setelah ditambah: $numbers")

    println("\n=== Test With ===")
    with(user){
        println("User Detail -> Nama: $name, Umur: $age")
    }
}
package oop_111284_Abid_Irsyad_Dinejad.week11

data class User(var name: String = "", var age: Int = 0)

fun main() {
    println("=== Test Apply ===")
    val user = User().apply {
        name = "Jack"
        age = 30
    }
    println(user)
}
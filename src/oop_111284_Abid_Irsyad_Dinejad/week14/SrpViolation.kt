package oop_111284_Abid_Irsyad_Dinejad.week14

data class User(val name: String, val email: String, val age: Int)

class UserManager {
    fun validateUser(user: User): Boolean {
        return user.email.contains("@") && user.age >= 18
    }

    fun saveUserToDatabase(user: User) {
        println("Inserting ${user.name} to database ${user.email}")
    }

    fun sendWelcomeEmail(user: User) {
        println("Sending Welcome Email to ${user.email}")
    }
}
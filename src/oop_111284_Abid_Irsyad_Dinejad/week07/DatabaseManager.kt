package oop_111284_Abid_Irsyad_Dinejad.week07

object DatabaseManager {
    var connetionStatus: String = "Disconnected"

    fun connect() {
        connetionStatus = "Connected"
        println("Connected to database")
    }
}
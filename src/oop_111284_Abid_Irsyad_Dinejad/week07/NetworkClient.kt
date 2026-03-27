package oop_111284_Abid_Irsyad_Dinejad.week07

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connected to $url....")
    }
}
package oop_111284_Abid_Irsyad_Dinejad.week06.Mandiri

class SmartSpeaker(override val id: String, override val name: String) : SmartDevice, Switchable {

    override fun turnOn() {
        println("Speaker [$name] dinyalakan.")
    }

    override fun turnOff() {
        println("Speaker [$name] dimatikan.")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}
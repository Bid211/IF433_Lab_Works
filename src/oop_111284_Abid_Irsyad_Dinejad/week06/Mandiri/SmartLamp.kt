package oop_111284_Abid_Irsyad_Dinejad.week06.Mandiri

class SmartLamp(override val id: String, override val name: String) : SmartDevice, Switchable {

    override fun turnOn() {
        println("Lampu [$name] dinyalakan.")
    }

    override fun turnOff() {
        println("Lampu [$name] dimatikan.")
    }
}


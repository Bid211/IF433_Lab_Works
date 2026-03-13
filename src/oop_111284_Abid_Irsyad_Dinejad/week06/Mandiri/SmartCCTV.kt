package oop_111284_Abid_Irsyad_Dinejad.week06.Mandiri

class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {

    override fun turnOn() {
        println("CCTV [$name] dinyalakan.")
        startRecord()
    }

    override fun turnOff() {
        println("CCTV [$name] dimatikan.")
    }

    override fun startRecord() {
        println("CCTV [$name] mulai merekam video keamanan...")
    }
}
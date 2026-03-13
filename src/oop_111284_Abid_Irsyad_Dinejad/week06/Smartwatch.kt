package oop_111284_Abid_Irsyad_Dinejad.week06

class Smartwatch : Watch(), BluetoothConnectable, Rechargeable {
    override fun showTime() {
        println("Layar OLED menyala 02:00 PM")
    }

    override fun connectToBluetooth() {
        println("Mencari perangkat untuk pairing.....")
    }

    override fun chargeBattery() {
        println("Mengisi daya menggunakan charger 15W.")
    }
}
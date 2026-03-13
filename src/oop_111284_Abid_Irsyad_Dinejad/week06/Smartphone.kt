package oop_111284_Abid_Irsyad_Dinejad.week06

class Smartphone : Camera, Phone {

    override fun turnOn() {
        super<Camera>.turnOn()
        super<Phone>.turnOn()
        println("Sistem operasi Smarthphone berhasil booting")
    }
}
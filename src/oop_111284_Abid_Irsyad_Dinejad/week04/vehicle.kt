package oop_111284_Abid_Irsyad_Dinejad.week04

open class Vehicle(val brand: String) {
    var speed: Int = 0

    open fun accelerate() {
        speed += 10
        println("$brand acceleration. Speed: $speed km/h")
    }

    open fun honk{
        println("Beep! Beep!")
    }
}
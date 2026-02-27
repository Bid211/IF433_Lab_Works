package oop_111284_Abid_Irsyad_Dinejad.week04

open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {

    fun openTrunk() {
        println("Bagasi Mobil $brand dengan $numberOfDoors pintu dibuka")
    }
}
package oop_111284_Abid_Irsyad_Dinejad.week04

fun main(){
    println("- - - Testing Vehicle - - -")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n- - - Testing Car - - -")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.accelerate()
    myCar.honk()
    myCar.openTrunk()
}
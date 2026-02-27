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

    println("\n- - - Tugas Mandiri 1 Electric Car - - -")
    val tesla = ElectricCar("Tesla model Y", 4, 100)

    tesla.accelerate()
    tesla.honk()
    tesla.openTrunk()

    println("\n--- Tugas Mandiri 2: Employee Hierarchy ---")
    val manager = Manager("Pak Budi", 10_000_000)
    val developer = Developer("Andi", 8_000_000, "Kotlin")

    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}
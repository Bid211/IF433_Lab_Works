package oop_111284_Abid_Irsyad_Dinejad.week02

class Student(val name: String, val nim: String, var major: String, val gpa: Double = 0.0) {
    init {
        if (nim.length != 5) {
            println("WARNING: NIM untuk mahasiswa $name tidak valid!")
        }
        println("Objek Student untuk $name berhasil dibuat.")
    }

    constructor(name: String, nim: String) : this(name, nim, "Non-Matriculated")
}
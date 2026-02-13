package oop_111284_Abid_Irsyad_Dinejad.week02

class Student (
    val name: String,
    val nim: String,
    var gpa: Double = 0.0,
    var major: String,
){
    class Student(val name: String, val nim: String, var major: String) {
        init {
            if (nim.length != 5) {
                println("Warning: Pbjek tercipta dengan NIM ($nim) yang tidak valid!")
                println("Data mahasiswa $name mungkin bermasalah di sistem")
            } else {
                println("LOG: Objek Student $name berhasil dengan dialokasikan di Memory")
            }
        }
    }
    constructor(name: String, nim: String) : this(name, nim, "Non-Matriculated") {
        println("Mahasiswa $name belum memilih jurusan.")
    }
}


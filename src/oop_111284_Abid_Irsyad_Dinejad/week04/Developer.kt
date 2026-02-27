package oop_111284_Abid_Irsyad_Dinejad.week04

class Developer(name: String, baseSalary: Int, val programmingLanguage: String) : Employee(name, baseSalary) {

    override fun work() {
        println("$name sedang ngoding menggunakan $programmingLanguage.")
    }

}
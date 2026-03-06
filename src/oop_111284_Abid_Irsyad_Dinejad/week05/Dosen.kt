package oop_111284_Abid_Irsyad_Dinejad.week05

class Dosen(nama:String, val nidn: String) : Pegawai(nama){
    override fun bekerja() {
        println("[$nama] Sedang menyiapkan materi perkuliahan dan merevisi RKPS.")
    }

    fun mengajar() {
        println("[$nama] Sedang mengajar di kelas.")
    }
}


package oop_111284_Abid_Irsyad_Dinejad.week05

class Admin(nama: String) : Pegawai(nama) {
    override fun bekerja() {
        println("[$nama] sedang duduk di depan komputer melayani Administrasi")
    }

    fun doAdminWork() {
        println("[$nama] sedang merekap data absensi mahasiswa  ")
    }
}
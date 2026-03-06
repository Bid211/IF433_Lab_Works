package oop_111284_Abid_Irsyad_Dinejad.week05

fun main(){
    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("==== Aktivitas Pegawai ====")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when(pegawai) {
            is Dosen ->{
                println("=> Terdeteksi sebagai dosen (NIDN: ${pegawai.nidn}")
                pegawai.mengajar()
            }
            is Admin ->{
                println("=> Terdektesi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("----------------------------")
    }
}
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

    println("\n--- Tugas Mandiri 1: Method Overloading ---")
    val math = MathHelper()

    val luasPersegi = math.hitungLuas(5)
    val luasPersegiPanjang = math.hitungLuas(4, 6)
    val luasLingkaran = math.hitungLuas(7.0)

    println("Luas Persegi (sisi=5): $luasPersegi")
    println("Luas Persegi Panjang (p=4, l=6): $luasPersegiPanjang")
    println("Luas Lingkaran (r=7.0): $luasLingkaran")



    println("\n--- Tugas Mandiri 2: Payment System & Smart Casting ---")

    val myWallet = EWallet("Dompet Digital", 50000.0)
    val myCard = CreditCard("Visa Platinum", 100000.0)

    val paymentMethods: List<PaymentMethod> = listOf(myWallet, myCard)

    for (method in paymentMethods) {
        println("\nMemproses pembayaran untuk: ${method.accountName}")

        method.processPayment(75000.0)

        if (method is EWallet) {
            println("-> Terdeteksi EWallet. Melakukan top-up darurat...")
            method.topUp(50000.0)

            println("-> Mencoba pembayaran ulang...")
            method.processPayment(75000.0)
        }
    }
}
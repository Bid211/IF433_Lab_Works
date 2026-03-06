package oop_111284_Abid_Irsyad_Dinejad.week05

class CreaditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("[$accountName] Pembayaran KREDIT SUKSES sebesar $amount. Total used: $usedAmount (Limit: $limit)")
        }else{
            println("[$accountName] Pembayaran KREDIT GAGAL! Limit tidak cukup. (Limit: $limit, Terpakai: $usedAmount)")
        }
    }
}
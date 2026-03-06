package oop_111284_Abid_Irsyad_Dinejad.week05

class Ewallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("[$accountName] Pembayaran SUKSES sebesar $amount. Sisa saldo: $balance")
        }else{
            println("[$accountName] Pembayaran GAGAL! Saldo tidak cukup. (Saldo: $balance, Butuh: $amount)")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("[$accountName] Top Up SUKSES sebesar $amount. Saldo saat ini: $balance")
    }
}
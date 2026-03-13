package oop_111284_Abid_Irsyad_Dinejad.week06

class Gopay : PaymentMethod {
    override fun pay(amount: Double) {println("Prosesing Rp$amount via Gopay")}
}

class CreditCard : PaymentMethod {
    override fun pay(amount: Double) {println("Prosesing Credit Card for$amount")}
}
package oop_111284_Abid_Irsyad_Dinejad.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}

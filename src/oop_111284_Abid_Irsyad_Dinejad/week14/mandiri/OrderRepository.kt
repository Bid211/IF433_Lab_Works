package oop_111284_Abid_Irsyad_Dinejad.week14.mandiri

interface OrderRepository {
    fun saveOrder(itemName: String, finalPrice: Double, customerType: String)
}

package oop_111284_Abid_Irsyad_Dinejad.week14.mandiri

class VipPricing : PricingStrategy {
    override fun calculate(price: Double): Double {
        return price * 0.90 // Diskon 10%
    }
}

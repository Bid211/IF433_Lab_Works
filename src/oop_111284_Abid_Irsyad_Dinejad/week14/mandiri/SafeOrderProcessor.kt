package oop_111284_Abid_Irsyad_Dinejad.week14.mandiri

class SafeOrderProcessor(
    val repo: OrderRepository,
    val notifier: NotificationService,
    val pricingStrategy: PricingStrategy
) {
    fun processOrder(itemName: String, basePrice: Double) {
        val finalPrice = pricingStrategy.calculate(basePrice)

        println("Memproses pesanan $itemName seharga $finalPrice")

        repo.saveOrder(itemName, finalPrice, getCustomerType())
        notifier.sendNotification(itemName)
    }

    private fun getCustomerType(): String {
        return when (pricingStrategy) {
            is VipPricing -> "VIP"
            is RegularPricing -> "REGULAR"
            else -> "REGULAR"
        }
    }
}

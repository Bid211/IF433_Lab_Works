package oop_111284_Abid_Irsyad_Dinejad.week14.mandiri

fun main() {
    val repo: OrderRepository = CsvOrderRepository("orders.csv")
    val notifier: NotificationService = EmailNotifier()

    val regularPricing: PricingStrategy = RegularPricing()
    val vipPricing: PricingStrategy = VipPricing()

    println("=== ORDER REGULAR ===")
    val regularProcessor = SafeOrderProcessor(repo, notifier, regularPricing)
    regularProcessor.processOrder("Laptop ASUS", 8500000.0)

    println()

    println("=== ORDER VIP ===")
    val vipProcessor = SafeOrderProcessor(repo, notifier, vipPricing)
    vipProcessor.processOrder("iPhone 15", 15000000.0)
}

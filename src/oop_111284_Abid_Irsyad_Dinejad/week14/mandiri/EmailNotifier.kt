package oop_111284_Abid_Irsyad_Dinejad.week14.mandiri

class EmailNotifier : NotificationService {
    override fun sendNotification(itemName: String) {
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}

package oop_111284_Abid_Irsyad_Dinejad.week08

import oop_111284_Abid_Irsyad_Dinejad.week07.mandiri.BattleState

class NotificationService
    fun sendEmail(emailAddress: String) {
        println("Sending email to $emailAddress")
    }

    fun processUser(user: UserProfile) {

        if (user.email != null) {
            sendEmail(user.email!!)
        } else {
            println("User ${user.name} does not have an email")
        }
    }
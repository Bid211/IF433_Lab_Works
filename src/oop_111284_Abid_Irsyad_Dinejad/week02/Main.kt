package oop_111284_Abid_Irsyad_Dinejad.week02

import java.util.Scanner
import kotlin.random.Random

fun main() {
    val scanner = Scanner(System.`in`)
    print("Nama Hero: ")
    val name = scanner.nextLine()
    print("Base Damage: ")
    val dmg = scanner.nextInt()

    val hero = Hero(name, dmg)
    var enemyHp = 100

    println("--- BATTLE START ---")

    while (hero.isAlive() && enemyHp > 0) {
        println("\nMenu: 1. Serang, 2. Kabur")
        print("Pilih: ")
        val act = scanner.nextInt()

        if (act == 1) {
            hero.attack("Enemy")
            enemyHp -= hero.baseDamage
            if (enemyHp < 0) enemyHp = 0
            println("HP Musuh: $enemyHp")

            if (enemyHp > 0) {
                val enemyDmg = Random.nextInt(10, 21)
                hero.takeDamage(enemyDmg)
            }
        } else {
            println("Kabur!")
            break
        }
    }

    println("Game Over. Hero HP: ${hero.hp}, Enemy HP: $enemyHp")
}
package oop_111284_Abid_Irsyad_Dinejad.week07.mandiri

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("ALERT: Bertemu monster ${event.monsterName}! Bersiap bertarung!")
        }
        is BattleState.LootDropped -> {
            val (name, damage, rarity) = event.item
            println("LOOT: Kamu mendapatkan $name (Damage: $damage, Rarity: $rarity)")
        }
        is BattleState.GameOver -> {
            println("GAME OVER: ${event.reason}")
        }
        is BattleState.SafeZone -> {
            println("SAFE ZONE: Kamu berada di zona aman. Istirahat sejenak.")
        }
    }
}
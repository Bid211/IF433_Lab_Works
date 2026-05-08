package oop_111284_Abid_Irsyad_Dinejad.week11.Mandiri

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    SmartDevice("Philips WiZ Living Room", "Lighting")
        .apply {
            isOnline = true
            powerLoad = 12
        }
        .also { device ->
            homeDevices.add(device)
        }

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

    SmartDevice("Ezviz Outdoor", "Camera")
        .apply {
            isOnline = true
            powerLoad = 5
        }
        .also { device ->
            println("(LOG) Kamera terhubung")
            homeDevices.add(device)
        }

    val acDevice = run {
        SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
    }
    homeDevices.add(acDevice)

    val feeder = SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10)
    homeDevices.add(feeder)

    val searchResult = homeDevices.find { it.category == "Camera" }

    searchResult?.let { device ->
        println(device.diagnose())
    }

    with(homeDevices) {
        println("=== RANGKUMAN DASHBOARD ===")
        println("Total Perangkat Terdaftar: ${this.size}")
    }


}


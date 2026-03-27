package week06

class SmartHomeHub {
    private val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("Perangkat '${device.name}' berhasil ditambahkan ke Hub.")
    }

    // Menggunakan Smart Casting untuk mengontrol perangkat secara massal
    fun activateSecurityMode() {
        println("\n=== MENGAKTIFKAN MODE KEAMANAN ===")
        for (device in devices) {
            if (device is Recordable) {
                [span_0](start_span)device.startRecord() // Hanya CCTV yang akan merekam[span_0](end_span)
            }
            if (device is SmartSpeaker) {
                [span_1](start_span)device.playMusic("Sirine Peringatan") // Speaker membunyikan sirine[span_1](end_span)
            }
        }
    }

    fun turnOffAllSwitches() {
        println("\n=== MEMATIKAN SEMUA SAKLAR ===")
        for (device in devices) {
            if (device is Switchable) {
                [span_2](start_span)device.turnOff() // Semua yang punya saklar akan mati[span_2](end_span)
            }
        }
    }
}
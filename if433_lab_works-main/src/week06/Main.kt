package week06

fun main() {
    // 1. Instansiasi perangkat (Sesuai tugas mandiri)
    val lampuTamu = SmartLamp("L01", "Ruang Tamu")
    val speakerDapur = SmartSpeaker("S01", "Google Nest Dapur")
    val cctvGarasi = SmartCCTV("C01", "Ezviz Garasi")

    // 2. Gunakan SmartHomeHub
    val hub = SmartHomeHub()
    hub.addDevice(lampuTamu)
    hub.addDevice(speakerDapur)
    hub.addDevice(cctvGarasi)

    // 3. Tes logika sistem
    hub.activateSecurityMode()
    hub.turnOffAllSwitches()
}
package week06

class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("CCTV $name aktif.")
        startRecord() // Otomatis rekam saat nyala
    }
    override fun turnOff() { println("CCTV $name mati.") }
    override fun startRecord() { println("CCTV $name mulai merekam...") }
}
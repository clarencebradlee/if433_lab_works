package week06

class SmartSpeaker(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() { println("Speaker $name aktif.") }
    override fun turnOff() { println("Speaker $name nonaktif.") }
    fun playMusic(song: String) { println("Memutar lagu $song dari Spotify.") }
}
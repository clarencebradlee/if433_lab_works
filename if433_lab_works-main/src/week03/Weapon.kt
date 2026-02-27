package week03

class Weapon(val name: String) {
    var damage: Int = 0
        set(value) {
            if (value < 0) {
                println("Damage tidak boleh negatif! Set ke 0.")
                field = 0
            } else {
                field = value
            }
        }
}

package week03

class Player(val name: String) {
    private var health: Int = 100

    fun takeDamage(damage: Int) {
        health -= damage
        if (health < 0) health = 0
        println("$name terkena $damage damage! Sisa darah: $health")
    }

    fun displayStatus() {
        println("Pemain: $name | HP: $health")
    }
}
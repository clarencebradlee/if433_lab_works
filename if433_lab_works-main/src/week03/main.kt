package week03

fun main() {
    val sword = Weapon("Pedang")
    val hero = Player("Clarence")

    sword.damage = 20

    hero.displayStatus()
    hero.takeDamage(sword.damage)
    hero.displayStatus()
}
package week04

fun main() {
    val manager = Manager("Budi", 8000000)
    val developer = Developer("Clarence", 7000000, "Kotlin")

    println("--- Testing Employee Hierarchy ---")

    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}
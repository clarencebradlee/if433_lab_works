package week04

open class Vehicle(val brand: String) {
    var speed: Int = 0

    // Method harus 'open' agar bisa di-override anaknya
    open fun accelerate() {
        speed += 10
        println("$brand melaju. Kecepatan: $speed km/jam")
    }

    open fun honk() {
        println("Beep beep!")
    }
}
package week03

fun main () {
    val e = Employee("Budi")
    println("--- Test Error ---")
    e.salary = 5000
    println ("Gaji si ${e.name} adalah ${e.salary}")
}
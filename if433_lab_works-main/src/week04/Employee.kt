package week04

open class Employee(val name: String, val baseSalary: Int) {
    open fun work() {
        [span_10](start_span)println("$name sedang bekerja.")[span_10](end_span)
    }

    open fun calculateBonus(): Int {
        [span_11](start_span)return (baseSalary * 0.1).toInt() // Bonus 10%[span_11](end_span)
    }
}
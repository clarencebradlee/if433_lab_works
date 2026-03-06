package week04

class Manager(name: String, baseSalary: Int) : Employee(name, baseSalary) {
    override fun work() {
        [span_14](start_span)println("$name sedang memimpin rapat divisi.")[span_14](end_span)
    }

    override fun calculateBonus(): Int {
        [span_15](start_span)// Bonus standar + 500.000[span_15](end_span)
        return super.calculateBonus() + 500000
    }
}
package week04

class Developer(name: String, baseSalary: Int, val programmingLanguage: String) : Employee(name, baseSalary) {
    override fun work() {
        [span_18](start_span)println("$name sedang ngoding menggunakan $programmingLanguage.")[span_18](end_span)
    }
    [span_19](start_span)// calculateBonus tidak di-override (ikut parent)[span_19](end_span)
}
package week05

fun main() {
    // --- Tes Tugas Mandiri 1 ---
    println("=== TES MATH HELPER (OVERLOADING) ===")
    val math = MathHelper()
    println("Luas Persegi: ${math.hitungLuas(5)}")
    println("Luas Persegi Panjang: ${math.hitungLuas(4, 6)}")
    println("Luas Lingkaran: ${math.hitungLuas(7.0)}")

    // --- Tes Tugas Mandiri 2 ---
    println("\n=== TES SISTEM PEMBAYARAN ===")
    val myWallet = EWallet("Clarence Wallet", 50000.0)
    val myCard = CreditCard("Clarence Card", 100000.0)

    val listPayment: List<PaymentMethod> = listOf(myWallet, myCard)

    for (pay in listPayment) {
        pay.processPayment(75000.0)

        // Smart Casting Challenge
        if (pay is EWallet && pay.balance < 75000.0) {
            println("-> Mendeteksi saldo kurang, otomatis Top Up...")
            pay.topUp(50000.0)
            pay.processPayment(75000.0)
        }
        println("---------------------------")
    }
}
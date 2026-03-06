package week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("[$accountName] Pembayaran E-Wallet sebesar Rp$amount sukses. Sisa saldo: Rp$balance")
        } else {
            println("[$accountName] Saldo E-Wallet tidak cukup untuk membayar Rp$amount")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("[$accountName] Berhasil Top Up Rp$amount. Saldo sekarang: Rp$balance")
    }
}
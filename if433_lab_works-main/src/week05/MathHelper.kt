package week05

class MathHelper {
    // Overloading: Nama fungsi sama, tapi parameter beda
    fun hitungLuas(sisi: Int): Int {
        return sisi * sisi
    }

    fun hitungLuas(panjang: Int, lebar: Int): Int {
        return panjang * lebar
    }

    fun hitungLuas(jariJari: Double): Double {
        return 3.14 * jariJari * jariJari
    }
}
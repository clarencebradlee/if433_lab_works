package week05

// Abstract class tidak bisa di-instansiasi langsung
abstract class Pegawai(val nama: String) {
    // Abstract function wajib di-override oleh kelas anak
    abstract fun bekerja()
}
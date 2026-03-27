package week06

class Smartphone : Camera, Phone {
    // Kita harus override manual untuk mengatasi kebingungan compiler
    override fun turnOn() {
        super<Camera>.turnOn() // Pilih jalankan logika Camera
        super<Phone>.turnOn()  // Dan jalankan logika Phone
        println("Sistem operasi Smartphone berhasil booting.")
    }
}
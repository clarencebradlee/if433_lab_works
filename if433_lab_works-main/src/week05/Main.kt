package week05

fun main() {
    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    // Polymorphic Collection: List yang berisi tipe Parent (Pegawai),
    // tapi isinya objek Anak (Dosen & Admin)
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")

    for (pegawai in daftarPegawai) {
        // 1. Pemanggilan Runtime Polymorphism
        // Meskipun tipenya Pegawai, yang jalan adalah fungsi milik Dosen/Admin
        pegawai.bekerja()

        // 2. Smart Casting dengan 'is' dan 'when'
        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar() // Smart cast! Bisa akses fungsi unik Dosen
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork() // Smart cast! Bisa akses fungsi unik Admin
            }
        }
        println("-------------------------")
    }
}
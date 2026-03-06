package week04

[span_5](start_span)// ElectricCar mewarisi Car[span_5](end_span)
class ElectricCar(brand: String, numberOfDoors: Int, val batteryCapacity: Int) : Car(brand, numberOfDoors) {

    [span_6](start_span)// Gunakan 'final' agar tidak bisa di-override lagi[span_6](end_span)
    final override fun accelerate() {
        [span_7](start_span)// Output khusus mobil listrik tanpa memanggil super[span_7](end_span)
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%.")
    }
}
package week03

class Employee(val nama: String)
{
    var salary: Int = 0
        set(value){
            println("mecoba set gaji ke: $value")

         this.salary = value
        }

}
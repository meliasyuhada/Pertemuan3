//pewarisan fitur class(property dan method)
//yang mewarisi dipanggil child clas atau subclass
//fitur yang fiturnya diwariskan disebut parent class.
package id.ac.polbeng.depandi.test_kelas

//parent class
open class Computer(val name: String, val brand: String){}

//child class
class Leptop(name: String, brand: String, val batteryLife: Double) : Computer(name, brand) {
    fun info() {
        println("Nma : $name")
        println("Brand : $brand")
        println("Battery Lie : $batteryLife")
    }
}

fun main() {
    val myLaptop = Leptop("Acer Aspire x114s", "Acer", 2.5)
    println(myLaptop.info())
}

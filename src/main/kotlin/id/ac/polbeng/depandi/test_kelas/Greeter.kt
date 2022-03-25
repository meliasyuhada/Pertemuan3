//kelas merupakan cetakan untuk membuat object
//digunakan untuk mendefinisikan atribut dan behaviour.
//terdiri dari konstruktor, initializer block, fungsi, property, nested dan inner class dan deklarasi objek.
package id.ac.polbeng.depandi.test_kelas

class Greeter {
    var text: String = ""
    fun greet() {
        println("Hello Object world!")
    }
    fun greet(name: String) {
        println("$text $name")
    }
    fun with_ret_val(name: String): String {
        return "$text $name"
    }
}
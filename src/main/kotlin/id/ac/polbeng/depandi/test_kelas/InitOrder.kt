//init berfungsi untuk menginisialisasi properti kelas
//juga berfungsi untuk membantu dalam memvalidasi sebuah nilai properti sebelum diinisialisasi.
package id.ac.polbeng.depandi.test_kelas

class InitOrder(name: String) {
    var firstProperty = "First Property: $name".also(::println)
    init {
        println("First initializer block that prints ${name}")
    }
    val secondaryProperty = "Second property: ${name.length}".also(::println)
    init {
        // Fungsi init dijalankan ketika suatu objek dibuat dengan menggunakan primary constructor
        println("Secondary initialized block that prints ${name.length}")
    }
}

fun main() {
    val initOrder = InitOrder("Software Engginering")
}
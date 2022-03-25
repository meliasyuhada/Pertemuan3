//Menurunkan urutan inisialisasi urutan kelas turunan
//untuk membuat instance baru dari kelas turunan, maka inisialisasi yang diselesaikan terlebih dahulu ialah inisialisasi dari kelas induk.
//begitu seterusnya sebelum inisialisasi logika dari kelas turunan berjalan.
package id.ac.polbeng.depandi.test_kelas

open class Base(val name: String) {
    init {
        println("Initializing Baase")
    }
    open val size: Int = name.length.also {
        println("Initializing sizw in Base: $it")
    }
}

class Derived(name: String, val lastName: String): Base(name.capitalize().also { println("Argument for base: $it") }) {
    init {
        println("Initializing Derived")
    }
    override val size: Int = (super.size + lastName.length).also {
        println("Initializing size in derived: $it")
    }
}

fun main() {
    val turunan = Derived("Septi", "Melia")
    turunan.size
}
package id.ac.polbeng.depandi.test_kelas

//Data Classes and Destructuring Declatations: The componentN() method
// destruksi data kelas sebuah objek kedalam variabel menggunakan fungsi componenN()
//component1 berfungsi mengembalikan nilai property pertama sebuah objek
//component2 berfungsi mengembalikan nilai property kedua sebuah objek.

fun main() {
    val lia = Student("Lia", 20)
    val name = lia.component1()
    val age = lia.component2()
    println("Name = $name")
    println("Age = $age")
}
package id.ac.polbeng.depandi.test_kelas

//Data Classes and Destructuring Declatations: The componentN() method
// bisa mendestruksi data kelas sebuah objek kedalam sejumlah variabel menggunakan destructing declarations.

//DataClassE
fun main() {
    val lia = Student("Lia", 20)
    val (name, age) = lia
    println("Name = $name")
    println("Age = $age")
}
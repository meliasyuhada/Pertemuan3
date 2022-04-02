package id.ac.polbeng.depandi.test_kelas

//Data Class = Memiliki tambahan funsionalitas dibandingkan kelas bisa.
/**
 * Data Class menurunkan implementasi class standart
 * - equals()
 * - hashCode()
 * - toString()
 *
 * syarat mendeklarasikan data kelas :
 * - konstruktor utama memilliki 1 buah parameter paling sedikit
 * - parameter yang dibuat di konstruktor utama harus ditandai dengan keyword val / var
 * - kelas tidak memiliki akses modifier open, abstract, inner dan sealed class
 *
 */

data class Student(val name: String, val age: Int)

fun main() {
    val hada = Student("Hada", 21)
    val lia = Student("Lia", 22)
    println("Student Name is: ${hada.name}")
    println("Student Age is: ${hada.age}")
    println("Student Name is: ${lia.name}")
    println("Student Age is: ${lia.age}")
}
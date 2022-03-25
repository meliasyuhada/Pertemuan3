//versi pendek
package id.ac.polbeng.depandi.test_kelas

class PersonC(var firstName: String, var lastName: String, var age: Int) {}

fun main() {
    val septi = PersonC("Septi", "Melia", 20)
    println("Nama : ${septi.firstName} ${septi.lastName}")
    println("Age : ${septi.age}")
}
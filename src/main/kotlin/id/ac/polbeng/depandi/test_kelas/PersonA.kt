//versi panjang dan detail
package id.ac.polbeng.depandi.test_kelas

class PersonA(_firstName: String, _lastName: String, _age: Int) {
    var firstName: String
    var lastName: String
    var age: Int
    init {
        firstName = _firstName
        lastName = _lastName
        age = _age
    }
}

fun main() {
    val septi = PersonA("Septi", "Melia", 20)
    println("Nama : ${septi.firstName} ${septi.lastName}")
    println("Age : ${septi.age}")
}
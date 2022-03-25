//versi sedang
package id.ac.polbeng.depandi.test_kelas

class PersonB(_firstName: String, _lastName: String, _age: Int) {
    var firstName: String = _firstName
    var lastName: String = _lastName
    var age: Int = _age
}

fun main() {
    val septi = PersonB("Septi", "Melia", 20)
    println("Nama : ${septi.firstName} ${septi.lastName}")
    println("Age : ${septi.age}")
}
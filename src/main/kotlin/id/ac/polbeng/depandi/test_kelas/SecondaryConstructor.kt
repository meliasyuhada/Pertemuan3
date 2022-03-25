//digunakan ketika kita ingin menginisialisasi sebuah kelas dengan cara yang lain.
//boleh tidak memiliki tubuh kelas
//bisa dibuat lebih dari satu secondary constructor.
package id.ac.polbeng.depandi.test_kelas

class SecondaryConstructor {
    var firstName: String
    var lastName: String
    var age: Int
    var alamat: String = "Selat baru"

    constructor(_firstName: String, _lastName: String, _age: Int) {
        //harus menggunakan keyword constructor
        firstName = _firstName
        lastName = _lastName
        age = _age
    }
    constructor(_firstName: String, _lastName: String, _age: Int, _alamat: String): this(_firstName, _lastName, _age) {
        alamat = _alamat
    }
    fun cetakInfo() {
        println("Nama : ${firstName} ${lastName}")
        println("Umur : ${age}")
        println("Alamat : ${alamat}")
    }
}

fun main() {
    val lia = SecondaryConstructor("Melia", "Syuhada", 20)
    lia.cetakInfo()
    println()
    val septi = SecondaryConstructor("Septi", "Melia", 20, "Selat baru")
    septi.cetakInfo()
}


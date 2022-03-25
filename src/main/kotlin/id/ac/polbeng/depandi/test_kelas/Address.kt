//Enkapsulasi
//OOP yang digunakan untuk menyembunyikan informasi dari suatu kelas, sehingga anggota kelas tidak bisa mengakses dari luar.

package id.ac.polbeng.depandi.test_kelas

class Address {
    var name: String = "Holmes, Sherlock"
    var street: String = "Baker"
    var city: String = "London"
    var state: String? = null
    var zip: String = "123456"
}
fun copyAddress(address: Address): Address {
    //memanggil fungsinya dengan menggunakan . "Titik"
    val result = Address()
    result.name = address.name
    result.street = address.street
    result.city = address.city

    return result
}
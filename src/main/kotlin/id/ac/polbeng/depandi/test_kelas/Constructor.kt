//constructor ada 2. primary constructor dan secondary constructor.
/*
Primary constructor juga dapat memiliki nilai default, dengan begitu jika
kita tidak menetapkan nilai untuk parameter tersebut maka properti
tersebut akan memiliki nilai default.
 */
package id.ac.polbeng.depandi.test_kelas

class Constructor(firstName: String, LastName: String) {

}

fun main() {
    var firstName = "Septi"
    var LastName = "Melia"
    println("Nama Lengkap = $firstName $LastName")
}
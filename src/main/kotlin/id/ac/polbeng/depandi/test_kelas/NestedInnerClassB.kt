package id.ac.polbeng.depandi.test_kelas

//Anonymous Class
// => membuat object interface menggunakan objek runtime.

fun main() {
    var programmer: Human = object : Human {
        override fun think() {
            println("I am an example of Anonymous Inner Class")
        }
    }
    programmer.think()
}
interface Human {
    fun think()
}
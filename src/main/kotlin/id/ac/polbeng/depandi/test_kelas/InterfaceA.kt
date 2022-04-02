package id.ac.polbeng.depandi.test_kelas

//Interfaces = tidak bisa diinstalasi karena tidak memiliki konstruktor
/**
 * - memiliki fungsi abstrak dan non-abstrak
 * - hanya dapat memiliki property abstrak(data member)
 * - sebuah kelas dapat mengimplementasikan lebih dari 1 interface
 * - semua abstrak property dan fungsi anggota abstrak dari sebuah interface harus di overridden didalam kelas yang mengimplementasikannya.
 * - tidak perlu access modifier final, open atau abstract.
 * - anggotanya memiliki akses open
 *
 */

//interfaceA
interface MyInterface {
    var str: String
    fun demo()
    fun func() {
        println("Hello")
    }
}

class MyClass: MyInterface{
    override var str: String = "Rekayasa Perangkat Lunak"
    override fun demo() {
        println("Demo Function")
    }
}

fun main() {
    val obj = MyClass()
    obj.demo()
    obj.func()
    println(obj.str)
}
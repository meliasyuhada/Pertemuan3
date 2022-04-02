package id.ac.polbeng.depandi.test_kelas

//Nested and Inner Class
//Nested Class = sebuah kelas yang dideklarasikan dikelas lain.
/**
 * - tidak dapat mengakses anggota dari kelas luarnya
 * - untuk mengakses anggota, gunakan('.')
 */

//NestedInnerClass
class Outer {
    val a = "Outside Nested class"
    class Nested {
        val b = "Inside Nested class"
        fun callMe() = "Function call from inside Nested class"
    }
}

fun main() {
    println(Outer.Nested().b)

    val nested = Outer.Nested()
    println(nested.callMe())
}
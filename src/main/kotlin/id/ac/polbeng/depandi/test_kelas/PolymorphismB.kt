/*- Dynamic(run-time) => terjadi saat mendefinisikan beberapa fungsi yang ovverride.
fungsi dipanggil ditentukan saat runtime.*/

package id.ac.polbeng.depandi.test_kelas

//Dynamic Polymoerphism(Overriding Function
open class MyBase {
    //harus menggunakan modifier "open" untuk memungkinkan kelas anak menimpanya.
    open fun think() {
        println("Hey!! i am thinking ")
    }
}
class MyDerived: MyBase() { //pewarisan terjadi menggunakan konstruktor default
    //harus menggunakakan modifier "override" untuk mengganti fungsi kelas dasar
    override fun think() {
        println("I am from child")
    }
}

fun main() {
    val myBase = MyBase()
    myBase.think()
    var myDerived = MyDerived()
    myDerived.think()
}

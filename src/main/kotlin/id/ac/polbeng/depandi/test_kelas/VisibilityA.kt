//Visibility Modifier
/***
 * jenis-jenis visibility modifier
 * - public => visibility default yang dapat diakses didalam dan luar kelas
 * - private => hanya bisa di akses dari dalam setiap kelas dan objek yang sama.
 * - protected => sama dengan private, namun instansiasi dapat dilakukan dari subclass(pewarisan)
 * - internal => bisa diakses dimanapun didalam modul.
 */
package id.ac.polbeng.depandi.test_kelas

//private
private class privateExample {
    private val i = 1
    private fun doSomething() {
        println("Welcome to Private access!")
        println("Private access : $i")
    }
    fun calldoSomething() {
        doSomething()
    }
}

//protected digunakan ketika kita menginginkan sebuah anggota dari induk kelas dapat diakses hanya oleh kelas yang merupakan turunannya
open class  C() {
    protected val i = 1
}
class D : C() {
    fun getValue() : Int {
        println("Welcome to protected access")
        return  i
    }
}

//internal
class internalExample {
    internal val i = 1
    internal fun doSomething() {
        println("Welcome to internal access")
        println("Internal Access $i")
    }
}

//public dapat diakses dari luar kelasnya melalui sebuah objek kelas tersebut
class publicExample {
    val i = 1
    fun doSomething() {
        println("Welcome to public access")
        println("Public Access : $i")
    }
}

fun main() {
    val objPrivate = privateExample()
    objPrivate.calldoSomething()
    val  objProtected = D()
    println("Protected Access : ${objProtected.getValue()}")
    val objInternal = internalExample()
    objInternal.doSomething()
    val objPublic = publicExample()
    objPublic.doSomething()

}
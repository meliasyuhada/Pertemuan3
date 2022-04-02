package id.ac.polbeng.depandi.test_kelas

//Resolve Problem in Multiple Interface Method
//=> cara memcahkan masalah ketika multiple interface memiliki method yang sama, yaitu dengan menambahkan keyword super.

//InterfaceD
interface A {
    fun demo() {
        println("From interface A")
    }
}
interface B {
    fun demo() {
        println("From interface B")
    }
}

class MyClassB: A, B {
    override fun demo() {
        super<A>.demo()
        super<B>.demo()
    }
}

fun main() {
    val obj = MyClassB()
    obj.demo()
}
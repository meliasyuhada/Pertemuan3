//Polymorphisme = konsep OOP
/*
2 jenis:
- Static(compile-time) => terjadi ketika mendefinisikan beberapa fungsi overloading,
                           nama sama tapi berbeda karakteristik parameter.
                           bisa menentukan fungsi mana yang dipanggil saat melakukan kompilasi.
 */
package id.ac.polbeng.depandi.test_kelas

//Static Polymorphism(Overloading Function)
fun printNumber(n: Number) {
    println("Using printNumber(n : Number)")
    println(n.toString() + "\n")
}
fun printNumber(n: Int) {
    println("Using printNumber(n: Int)")
    println(n.toString() + "\n")
}
fun printNumber(n: Double) {
    println("Using printNumber(n: Double)")
    println(n.toString() + "\n")
}
fun printNumber(n: Int, str:String) {
    println("Using printNumber(n: Int, str:String)")
    println(str + n.toString() + "\n")
}
fun main() {
    val a: Number = 99
    val b = 1
    val c = 3.1
    printNumber(a)
    printNumber(b)
    printNumber(c)
    printNumber(b, "Overloading function ")
}

package id.ac.polbeng.depandi.test_kelas

//Data Class B
//Implementasi fungsi hashCode() dan equals()
fun main() {
    val hada = Student("Hada", 21)
    val newHada = Student("Hada", 21)
    val lia = Student("Lia", 22)
    if (hada.equals(newHada))
        println("Hada is wqual to newHada")
    else
        println("Hada is not equal to newHada")

    if (hada.equals(lia))
        println("Hada is equal lia")
    else
        println("Hada is not equal to lia")

    println("HAsCode of hada: ${hada.hashCode()}")
    println("HashCode of newHada: ${newHada.hashCode()}")
    println("HashCode of lia: ${lia.hashCode()}")
}
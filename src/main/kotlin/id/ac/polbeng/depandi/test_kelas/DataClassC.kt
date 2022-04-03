package id.ac.polbeng.depandi.test_kelas

//Data Class copy() method
// untuk membuat objek salinan(copy) dengan beberapa property yang berbesa, menggunakan fungsi copy()

//DataClassC
fun main() {
    val lia = Student("Lia", 20)
    val riko = lia.copy("Riko")
    if (lia.equals(riko))
        println("Lia is equals to riko")
    else
        println("Lia is not equals to riko")
    println("Hashcode of lia: ${lia.hashCode()}")
    println("Hashcodr of riko: ${riko.hashCode()}")
}
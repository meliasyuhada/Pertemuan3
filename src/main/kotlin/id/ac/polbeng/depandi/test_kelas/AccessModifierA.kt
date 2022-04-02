package id.ac.polbeng.depandi.test_kelas

/***
 * Access Modofier
 * - final
 * - open
 * - abstract
 * - override
 *
 * secara default access modifier di kotlin adalah final.
 */

//AccessModifierA
open class Mahasiswa(var nama: String, var nim: Int){
    open fun info() {
        println(nama +'\n' + nim)
    }
    override fun toString(): String { //tostring merupakan bagian dari clas any, untuk menggunakakan atau memasaukannya. maka gunakan override sebelum toString()
        return "Mahasiswa{nama = $nama, nim = $nim}"
    }
}

class KetuaHima(nama: String, nim: Int, val jurusan: String): Mahasiswa(nama, nim) {
    @Override
    override fun info() {
        println(nama + '\n' + nim + '\n' + jurusan)
    }
}

fun main() {
    val septi = Mahasiswa("Septi Melia", 630419121)
    val melia = KetuaHima("Melia", 63041920, "Teknik Informatika")
    println(melia.toString())

    println()
    melia.info()
    println("Jenis Kelas = " + melia.javaClass.simpleName)

    println()
    septi.info()
    println("Jenis Kelas = " + septi.javaClass.simpleName)

    val syuhada = KetuaHima("Syuhada", 63041933, "Teknik Mesin")
    println()
    syuhada.info()
    println("Jenis Kelas = "+ syuhada.javaClass.simpleName)
}
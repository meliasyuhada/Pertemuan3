//Overriding Function
package id.ac.polbeng.depandi.test_kelas

open class Teacher {
    //akses modifier open digunakan untuk meng-override fungsi dikelas induk.
    open fun teach() {
        println("Teaching...")
    }

    fun info() {
        println("I'am a Teacher")
    }
}

class MathsTeacher : Teacher() {
    override fun teach() {
        println("Teaching Maths...")
    }
}

fun main() {
    val teacher = Teacher()
    val mathsTeacher = MathsTeacher()
    mathsTeacher.info()
    teacher.teach()
    mathsTeacher.teach()
}

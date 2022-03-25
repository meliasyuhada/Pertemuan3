//Ovverriding Property's Getter/Setter Method
//menggunakan custom getter dan setter untuk menginisialisasikan property kelas.
package id.ac.polbeng.depandi.test_kelas

open class NewPerson {
    open var age: Int = 1
}

class ChackedPerson: NewPerson() {
    override var age: Int = 1
        set(value) {
            field = if (value > 0)
                value else throw
                    IllegalAccessException("Age can not be negative")
        }
}

fun main() {
    val person = NewPerson()
    person.age = -5

    val chackedPerson = ChackedPerson()
    chackedPerson.age = -5
}
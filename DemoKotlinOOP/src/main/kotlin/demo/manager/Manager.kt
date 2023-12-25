package demo.manager

import demo.model.Classroom
import demo.model.Student

class Manager {

    private var classroom: Classroom

    init {
        println("Moi ban nhap ten lop: ")
        val nameClass = readln()
        println("Moi ban nhap ma lop: ")
        val classCode = readln()

        classroom = Classroom(
            name = nameClass,
            code = classCode
        )
    }
.....
    // Nhập số lượng học sinh
    private fun inputNumberStudent(): Int {
        println("Moi ban nhap so luong học sinh: ")
        return readlnOrNull()?.toInt() ?: 0
    }

    //Nhap thong tin danh sach hoc sinh
    fun inputListStudent() {
        val countStudent = inputNumberStudent()
        (1..countStudent).forEach {
            println("Moi ban nhap thong tin hoc sinh thu $it:")
            classroom.addStudent(inputInformationStudent())
        }
    }


    private fun inputInformationStudent(): Student {
        println("Moi ban nhap ten hoc sinh: ")
        val studentName = readln()
        println("Moi ban nhap ma hoc sinh: ")
        val studentCode = readln()
        println("Moi ban nhap tuoi hoc sinh: ")
        val studentAge = readln().toInt()
        println("Moi ban nhap gioi tinh hoc sinh: ")
        val studentSex = readln()
        return Student(code = studentCode, name = studentName, age = studentAge, sex = studentSex)
    }

    fun showInfoClassroom() = println("Duoi day la thong tin lop hoc cua ban: \n$classroom")
}
package demo.model

data class Student(val code: String, val name: String, val age: Int, val sex: String) {
    override fun toString(): String {
        return "Student(code='$code', name='$name', age=$age, sex=$sex) \n"
    }
}

data class Classroom(val code: String = "", val name: String = "", val list: MutableList<Student> = mutableListOf()) {
    fun addStudent(student: Student) = list.add(student)
    fun removeStudent(student: Student) = list.remove(student)
    fun removeStudentWithIndex(pos: Int) = list.removeAt(pos)
    fun findStudentsWithName(name: String) = list.filter { it.name == name }
    fun findStudentsWithCode(code: String) = list.filter { it.code == code }
    fun findStudentsWithAge(age: Int) = list.filter { it.age == age }
    override fun toString(): String {
        return "Classroom(Ma lop hoc ='$code',\n Ten lop = '$name',\n Danh sach hoc sinh = $list) \n"
    }
.....
}

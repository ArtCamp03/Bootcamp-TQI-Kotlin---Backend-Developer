package also

data class Person(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

fun writeCreateLog() {
    //println("A new person ${p.name} was created")
}

fun main() {
    val jake = Person("Jake",30, "Android Developer")
        .also {
            //writeCreateLog(it)
        }
}
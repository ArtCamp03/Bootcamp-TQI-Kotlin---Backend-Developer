package apply

data class Person(var nome: String, var age: Int, var about:String) {
    constructor() : this("", 0, "")
}

fun mnain(){

    val jake = Person()
    val stringDescription = jake.apply {
        nome = "Jake"
        age = 30
        about = "Android Developer"
    }.toString()

    println(stringDescription)

}
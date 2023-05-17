import functions.Function

fun main() {
    println("Hello World!")

    // instancia classee Function e chama seus metodos
    val func = Function()
    println(func.sum(12,10))

    // vararg trata a variavel com uma quantidade infinita
    fun printAll(vararg messages: String){
        for(m in messages) println(m)
    }
    printAll("Hello", "Hell", "Salut", "Hola")

    fun printAllWithPrefix(vararg messages: String, prefix: String){
        for( n in messages) println(prefix + n)
    }

    printAllWithPrefix(
        "Hello", "Hell", "Salut", "Hola",
        prefix = "Greeting"
    )

    fun log(vararg entries: String) {
        printAll(*entries)
    }
    log("Hello", "Hell", "Salut", "Hola")

}
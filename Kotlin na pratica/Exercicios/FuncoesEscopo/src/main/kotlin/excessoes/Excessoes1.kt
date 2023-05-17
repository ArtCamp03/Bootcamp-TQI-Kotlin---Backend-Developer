package excessoes

class Excessoes1 {
}

fun main() {

    val a = 10
    val b = 15

    try {
        val divisao = a/b
        print(divisao)
    }catch(e : Throwable) {
        e.printStackTrace()
        println(e.message)
    } finally {
        println(" Finally executado!!")
    }

}
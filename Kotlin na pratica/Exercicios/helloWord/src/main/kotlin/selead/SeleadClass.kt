package selead

class SeleadClass {

    sealed class MammaL(val nome:String)

    class Cat(val catNome: String): MammaL(catNome)
    class Human(val humanNopme: String, val job: String) : MammaL(humanNopme)

    fun greetMammaL(mammaL: MammaL): String {
        when(mammaL) {
            is Human -> return "Hello ${mammaL.nome}; You´re working as a ${mammaL.job}"
            is Cat -> return "Hello ${mammaL.nome}"
        }
    }

    fun main() {
        println(greetMammaL(Cat("Snowy")))
    }

}
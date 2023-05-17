package herancas

class Heranca {

    open class Dog {
        open fun sayHello(){
            println("Wow wow")
        }
    }


    class Yorkshire :Dog() {
        override fun sayHello(){
            println("wif wif")
        }
    }

    fun man(){
        val dog: Dog = Yorkshire()
        dog.sayHello
    }
}
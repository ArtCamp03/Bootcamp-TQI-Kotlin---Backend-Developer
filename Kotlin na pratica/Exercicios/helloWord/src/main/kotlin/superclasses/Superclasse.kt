package superclasses

class Superclasse {

    open class Lion(val nome: String, val origin: String) {
        fun sayHello() {
            println("$name, the lion from $origin says: graooh!")
        }
    }

    class Asiatic(name: STring) : Lion(name = name, origin = "India")

    fun man() {
        val lion: Lion = Asiatic("Rufo")
        lion.sayHello()
    }

}
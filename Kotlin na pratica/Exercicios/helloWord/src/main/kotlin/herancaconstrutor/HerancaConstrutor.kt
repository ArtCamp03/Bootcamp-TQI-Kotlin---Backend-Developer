package herancaconstrutor

class HerancaConstrutor {

    open class Tiger(val origin: String) {
        fun sayHello() {
            println("A tiger from $origin says: grrhhh")
        }
    }

    class SiberionTiger : Tiger("Siberia")

    fun man() {
        val tiger: Tiger = SiberionTiger()
        tiger.sayHello()
    }

}
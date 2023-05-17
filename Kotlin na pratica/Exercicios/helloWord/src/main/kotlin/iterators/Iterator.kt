package iterators

class Iterator {
    class Animal(val name: String)
    class Zoo(val animals: List<Animal>){
        operator fun iterator(): Iterator<Animal> {
            return animals.iterator()
        }
    }

    fun principal(){
        val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))

        for (animal in zoo){
            println("watch out, it`s a ${animal.name}")
        }
    }
}
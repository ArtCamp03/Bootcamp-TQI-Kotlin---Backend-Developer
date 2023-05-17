package data

class DataClass {

    data class User(val name: String, val id: Int) {
        override fun equals(other: Any?) =
            other is User && other.is == this.id
    }

    fun main(){
        val user = User("Alex", 1)
        println(user)

        val secondUser = User("Alex", 1)
        val thirdUser = User("Max", 2)

        println("user == secondUser: ${user == secondUser}")
        println("user == thirdUser: ${user == thirdUser}")

        //hashCode() function
        println(user.hashCode())
        println(secondUser.hashCode())
        println(thirdUser.hashCode())

        //copy() function



    }

}
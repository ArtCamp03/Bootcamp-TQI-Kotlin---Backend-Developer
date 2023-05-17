package listas

class List {

    fun principal(){
        val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)
        val sudoers: List<Int> = systemUsers

        fun addSystemUser(newUser: Int) {
            systemUsers.add(newUser)
        }

        fun getSysSudoes(): List<Int>{
            return sudoers
        }

        fun man(){
            addSystemUser(4)
            println("Tot sudoers: ${getSysSudoes().size}")
            getSysSudoes().forEach {
                i -> println("Some useful info on user $i")
            }
            // getSysSudoes().add(5) <- Error
        }
    }

}
package enumClass

class EnumClass {

    enum class State {
        IDLE, RUNNING, FINISHED
    }

    fun main() {
        val state = State.RUNNING
        val message = when(state) {
            State.IDLE -> "It´s idle"
            State.RUNNING -> "It´s running"
            State.FINISHED -> "It´s fineshed"
        }
        println(message)
    }


}
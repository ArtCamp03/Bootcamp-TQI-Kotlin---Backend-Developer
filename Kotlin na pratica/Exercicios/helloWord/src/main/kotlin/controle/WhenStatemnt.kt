package controle

class WhenStatemnt {
    fun principal(){
        cases("Hello")
        cases(1)
        cases(0L)
        cases(MyClass())
        cases("Hello")
    }

    fun cases(obj: Any){
        when(obj) {
            1 -> println("One")
            "Hello" -> println("Greeting")
            is Long -> println("Long")
            !is String -> println("Not a string")
            else -> println("Unknown")
        }
    }
}
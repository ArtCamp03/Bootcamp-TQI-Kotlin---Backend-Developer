package functions

class Function {
    fun printMessage(message: String): Unit{
        println(message)
    }

    fun printMessageWithPrefix(message:String, prefix: String = "Info"){
        println("[$prefix] $message")
    }

    fun sum(x: Int, y: Int): Int{
        return x + y
    }

    // inline function -> funçao definida em uma unica linha
    fun multiply(x: Int, y: Int) = x * y

}
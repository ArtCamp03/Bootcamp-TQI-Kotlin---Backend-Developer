package igualdade

class Igual {

    fun main(){
        val authors = setOf("Shakespare", "Hemingway","Twain")
        val writhers = setOf("Twain", "Hemingway","Shakespare")

        println(authors == writhers)
        println(authors === writhers)
    }

    // IF ternario
    fun principal(){

        // IF como expression
        fun max(a: Int, b: Int) = if(a > b) a else b

        println(max(99, -42))
    }

}
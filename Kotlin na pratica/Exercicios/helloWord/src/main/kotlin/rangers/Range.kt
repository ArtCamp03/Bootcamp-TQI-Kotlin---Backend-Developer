package rangers

class Range {
    fun main(){
        for(i in 0..3){
            print(i)
        }
        println("")

        for(i in 0 until 3){
            print(i)
        }
        println("")

        for(i in 2..8 step 2){
            print(i)
        }
        println("")

        for(i in 3 downTo 0){
            print(i)
        }
        println("")

        // Intervalos de caracteres
        for(i in 'a'..'g'){
            print(i)
        }
        println("")

        for(i in 'c' downTo 's' step 2){
            print(i)
        }
        println("")

        // Com Ifs
        val x = 2
        if(x in 1..5){
            print("x is in range from 1 to 5")
        }
        println()

        val x = 2
        if(x !in 6..15){
            print("x is in range from 1 to 5")
        }
        println()


    }
}
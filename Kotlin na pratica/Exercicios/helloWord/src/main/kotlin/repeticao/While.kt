package repeticao

class While {
    fun eatAcake() = println("Eat a Cake")
    fun bakeACake() = println("Bake a Cake")

    fun principal(){
        var cakesEaten = 0
        var cakesBaked = 0

        while(cakesEaten < 5){
            eatAcake()
            cakesEaten ++
        }

        do{
            bakeACake()
            cakesBaked++
        }while (cakesBaked < cakesEaten)
    }
}
package desafio1

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
     //   inscritos.add(usuario.toString())
    }
}

fun main() {

    val conteudo = ConteudoEducacional("Fisica", 60)
    //Formacao("Fisica",onteudo)

}

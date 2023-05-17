package exercicios

fun main() {
    val entrada: String? = readLine()

    val (dia, mes, ano) = entrada!!.split("/")

    val mesPorExtenso = when {
        mes.toInt() == 1 -> "Janeiro"
        mes.toInt() == 2 -> "Fevereiro"
        mes.toInt() == 3 -> "Marco"
        mes.toInt() == 4 -> "Abril"
        mes.toInt() == 5 -> "Maio"
        mes.toInt() == 6 -> "Junho"
        mes.toInt() == 7 -> "Julho"
        mes.toInt() == 8 -> "Agosto"
        mes.toInt() == 9 -> "Setembro"
        mes.toInt() == 10 -> "Outubro"
        mes.toInt() == 11 -> "Novembro"
        mes.toInt() == 12 -> "Dzembro"
        else -> "Mês Inválido!"
    }

    println("$dia de $mesPorExtenso de $ano")
}
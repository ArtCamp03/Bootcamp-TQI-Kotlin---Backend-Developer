package run

fun getNulLableLength(ns: String?) {
    println("for \"$ns\":")
    ns?.run {
        println("\tis empty? " + isEmpty())
        println("\tlength = $length")
        length
    }
}


fun main() {
    getNulLableLength(null)
    getNulLableLength("")
    getNulLableLength("Some string with kotlin")
}

package desafios.basicos

// Calcule a média de uma lista de números.

fun main() {
    val numeros = listOf(1, 3, 12, 25, 32, 50, 53)
    println(media(numeros))
}

fun media(numeros: List<Int>) : String {
    val total = numeros.sum()
    val media = total / numeros.size
    return "A média dos valores $numeros é $media"
}
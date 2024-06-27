package desafios.basicos

fun main() {
    val nomes = listOf("Waldomar", "Lucas", "José", "Carlos", "Ana", "Zara", "Douglas")
    println(ordenarNomes(nomes))
}

fun ordenarNomes(nomes: List<String>) : String {
    val nomes_ordenados = nomes.sorted()
    return "Os nomes $nomes em ordem alfabética fica: $nomes_ordenados"
}
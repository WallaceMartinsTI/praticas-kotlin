package desafios.basicos

// Crie um programa que calcule o fatorial de um número.

fun main() {
    val numero = 10
    val resultadoFatorial = fatorial((numero))
    println("O fatorial de $numero! é $resultadoFatorial")
}

fun fatorial(numero: Int) : Int {
    var valor = numero
    var total = 1
    while (valor > 0) {
        total *= valor
        valor += -1
    }

    return total
}
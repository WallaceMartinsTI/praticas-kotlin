package desafios.basicos

// Escreva um programa que verifique se um número é par ou ímpar.

fun main() {
    val numero = 10
    val resultado = if (numero % 2 == 0) "par" else "impar"
    println("O número $numero é $resultado")
}
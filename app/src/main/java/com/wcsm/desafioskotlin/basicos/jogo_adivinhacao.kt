package desafios.intermediario

import kotlin.random.Random

// Faça um programa que simule um jogo de adivinhação.

fun main() {
    println("Jogo da adivinhação")
    print("Informe um número de 1 a 10: ")

    val numero_aleatorio = Random.nextInt(1, 10)

    val numero_informaddo = readln().toInt()

    if (numero_informaddo == numero_aleatorio) {
        println("Você acertou, o número secreto era: $numero_aleatorio")
    } else {
        println("Você errou, o número secreto era: $numero_aleatorio e você chutou: $numero_informaddo")
    }
}
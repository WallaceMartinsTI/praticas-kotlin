package desafios.intermediario

import kotlin.random.Random

fun main() {
    println("Adivinhe o número de 1 a 10")
    print("Palpite: ")
    val input = readln()
    try {
        val palpite = input.toInt()
        val randomNumber = getRandomNumber()
        if(palpite == randomNumber) {
			println("Você acertou!")
        } else {
            println("Você errou!")
        }
    } catch (e: Exception) {
        e.printStackTrace()
        println("VALOR INVÁLIDO")
    }
}

fun getRandomNumber(): Int {
    return Random.nextInt(1, 10)
}
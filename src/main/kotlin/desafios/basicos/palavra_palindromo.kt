package desafios.basicos

// Escreva um programa em Kotlin que detecta se uma palavra é palíndromo (igual a sua versão de trás pra frente).

fun main() {
  val palavra1 = "kaiak"
  val palavra2 = "carro"

}

fun isPalindrome(word: String): Boolean {
  return word == word.reversed()
}
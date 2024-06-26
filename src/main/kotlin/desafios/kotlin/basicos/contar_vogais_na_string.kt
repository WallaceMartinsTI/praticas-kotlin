package desafios.basicos

// Faça um programa que conte quantas vogais existem em uma string.

fun main() {
    val palavra = "paralelepipedo"
    println(contar_vogais(palavra))
}

fun contar_vogais(palavra: String) : String {
    val vogais = listOf("A", "E", "I", "O", "U")
    val palavra_formatada = palavra.uppercase()
    var quantidade_vogais = 0

    for (letra in palavra_formatada) {
        if (vogais.contains(letra.toString())) {
            quantidade_vogais++
        }
    }

    return "A palavra $palavra_formatada tem $quantidade_vogais vogais!"
}
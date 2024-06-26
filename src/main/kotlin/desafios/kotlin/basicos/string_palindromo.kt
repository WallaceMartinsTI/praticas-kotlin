package desafios.basicos

// Implemente um programa que verifique se uma string é um palíndromo.

fun main() {
    //val palavra = "ana"
    val palavra = "casamento"
    println(ePalindromo(palavra))
}

fun ePalindromo(palavra: String) : String {
    val palavra_inversa = palavra.reversed().uppercase()
    return if (palavra.uppercase() == palavra_inversa) {
        "${palavra.uppercase()} é igual a $palavra_inversa logo ${palavra.uppercase()} é um palíndromo."
    } else {
        "${palavra.uppercase()} não é igual a $palavra_inversa logo ${palavra.uppercase()} não é um palíndromo."
    }
}
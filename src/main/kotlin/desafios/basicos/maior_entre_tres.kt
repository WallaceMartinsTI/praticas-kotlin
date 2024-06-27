package desafios.basicos

// Crie um programa que calcule o maior valor entre três números.

fun main() {
    val numero1 = 10
    val numero2 = 5
    val numero3 = 35

    println(maiorNumeroEntreTres(numero1, numero2, numero3))
}

fun maiorNumeroEntreTres(num1: Int, num2: Int, num3: Int) : String {
    return if (num1 > num2 && num1 > num3) {
        "Número $num1 é o maior número informado"
    } else if((num2 > num1 && num2 > num3)) {
        "Número $num2 é o maior número informado"
    } else {
        "Número $num3 é o maior número informado"
    }
}
package desafios.basicos

// Faça um programa que verifique se um número é primo.

fun main() {
    for(num in 200..400) {
        println(detectarPrimo(num))
    }
}

fun detectarPrimo(numero : Int) : Boolean {
    print("$numero - ")
    if (numero < 2) {
        return false
    } else if (numero == 2 || numero == 3 || numero == 5 || numero == 7 || numero == 11) {
        return true
    } else if (numero % 2 == 0 || numero % 3 == 0 || numero % 5 == 0 || numero % 7 == 0 || numero % 11 == 0) {
        return false
    } else {
        return true
    }
}
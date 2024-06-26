package desafios.basicos

// Crie um programa que converta graus Celsius para Fahrenheit.

fun main() {
    val graus_celsius = 30
    val celsius_para_fahrenheit = ((graus_celsius * 9) / 5 + 32)
    println("Convertendo ${graus_celsius}ºC para Fahrenheit, temos: ${celsius_para_fahrenheit}ºF")
}
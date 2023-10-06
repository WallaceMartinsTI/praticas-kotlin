package desafios.basicos

// Faça um programa que leia o raio de um círculo e calcule a área.

fun main() {
    val pi = 3.14
    val raio_do_circulo = 10.0
    val area_do_circulo = pi * (Math.pow(raio_do_circulo, 2.0))
    println("A área do círculo informado é: $area_do_circulo")
}
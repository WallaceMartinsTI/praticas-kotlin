package desafios.basicos

// Faça um programa que calcule a área e o perímetro de um retângulo.

fun main() {
    val base = 11
    val altura = 7

    println(calcularAreaPerimetro(base, altura))
}

fun calcularAreaPerimetro(base: Int, altura: Int) : String {
    val area = base * altura
    val perimetro = 2 * (base + altura)

    return "A Área do retânguro informado é: $area\nO Périmetro do retângulo informado é: $perimetro"
}
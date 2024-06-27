package desafios.basicos

fun main() {
  val letra = 'a'
  val palavra = "CARRO"
  
  if(letraNaPalavra(letra, palavra)) {
      println("A palavra $palavra tem a letra $letra.")
  } else {
      println("A palavra $palavra não tem a letra $letra.")
  }
  
}

fun letraNaPalavra(letra: Char, palavra: String): Boolean {
  return palavra.uppercase().contains(letra.uppercase())
}
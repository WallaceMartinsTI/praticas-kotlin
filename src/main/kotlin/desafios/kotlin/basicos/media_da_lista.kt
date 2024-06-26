package desafios.basicos

fun main() {
  val lista = listOf(1, 3, 5, 8, 10, 15)
  println(somarTotalLista(lista))
  
}

fun somarTotalLista(lista: List<Int>): Int {
  var total = 0
  lista.forEach {
      total += it
  }
  val media = total / lista.size
  return media
}
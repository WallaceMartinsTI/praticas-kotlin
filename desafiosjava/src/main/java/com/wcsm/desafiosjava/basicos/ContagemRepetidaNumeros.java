package com.wcsm.desafiosjava.basicos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
====================================================
Solucionando Desafios em Java
====================================================
3/3 - Contagem repetida de números
====================================================

Desafio
Neste desafio sua tarefa será ler vários números e em seguida dizer quantas vezes cada número
aparece, ou seja, deve-se escrever cada um dos valores distintos que aparecem na entrada por ordem
crescente de valor.

Entrada
A primeira linha de entrada contem um único inteiro N, que indica a quantidade de valores que
serão lidos para X (1 ≤ N ≤ 2000) logo em seguida. Com certeza cada número não aparecerá mais do
que 20 vezes na entrada de dados.

Saída
Imprima a saída de acordo com o exemplo fornecido abaixo, indicando quantas vezes cada um
deles aparece na entrada por ordem crescente de valor.

-----------------------------------------------
| Exemplo de Entrada | Exemplo de Saída       |
-----------------------------------------------
| 7                  | 4 aparece 1 vez(es)    |
| 8                  | 8 aparece 2 vez(es)    |
| 10                 | 10 aparece 3 vez(es)   |
| 8                  | 260 aparece 1 vez(es)  |
| 260                |                        |
| 4                  |                        |
| 10                 |                        |
| 10                 |                        |
-----------------------------------------------
*/
class ContagemRepetidaNumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de numeros que você vai passar.");
        System.out.print("Quantidade de numeros: ");
        String quantidadeInput = sc.nextLine();

        Map<Integer, Integer> numeros = new HashMap<>();

        try {
            int quantidade = Integer.parseInt(quantidadeInput);

            for(int x = 0; x < quantidade; x++) {
                System.out.printf("Numero %d: ", x + 1);
                String numeroInput = sc.nextLine();
                try {
                    int numero = Integer.parseInt(numeroInput);
                    if(numeros.containsKey(numero)) {
                        int quantidadeNumero = numeros.get(numero);
                        numeros.put(numero, ++quantidadeNumero);
                    } else {
                        numeros.put(numero, 1);
                    }
                } catch (Exception e) {
                    System.out.println("Voce informou um numero invalido.");
                }
            }

        } catch (Exception e) {
            System.out.println("Voce informou uma quantidade invalida.");
        }

        numeros.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println(e.getKey() + " aparece " + e.getValue() + " vez(es)"));

        sc.close();
    }

}

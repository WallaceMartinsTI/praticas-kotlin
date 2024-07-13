package com.wcsm.desafiosjava.basicos;

import java.util.Scanner;

/*
====================================================
Solucionando Desafios em Java
====================================================
1/3 - Diferença
====================================================

Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de
A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

Entrada
O arquivo de entrada contém 4 valores inteiros.

Saída
Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo, com um
espaço em branco antes e depois da igualdade.

--------------------------------------------
| Exemplo de Entrada | Exemplo de Saída    |
--------------------------------------------
| 5                  | DIFERENCA = -26     |
| 6                  |                     |
| 7                  |                     |
| 8                  |                     |
--------------------------------------------
| 0                  | DIFERENCA = -56     |
| 0                  |                     |
| 7                  |                     |
| 8                  |                     |
--------------------------------------------
| 5                  | DIFERENCA = 86      |
| 6                  |                     |
| -7                 |                     |
| 8                  |                     |
--------------------------------------------
*/
class Diferenca {

    public static void main(String[] args) {
        System.out.println("Informe 4 valores inteiros.");

        Scanner sc = new Scanner(System.in);

        String inputA, inputB, inputC, inputD;

        System.out.print("Valor A: ");
        inputA = sc.nextLine();

        System.out.print("Valor B: ");
        inputB = sc.nextLine();

        System.out.print("Valor C: ");
        inputC = sc.nextLine();

        System.out.print("Valor D: ");
        inputD = sc.nextLine();

        try {
            int valorA, valorB, valorC, valorD;

            valorA = Integer.parseInt(inputA);
            valorB = Integer.parseInt(inputB);
            valorC = Integer.parseInt(inputC);
            valorD = Integer.parseInt(inputD);

            int diferenca = (valorA * valorB) - (valorC * valorD);
            System.out.println("DIFERENCA = " + diferenca);
        } catch (Exception e) {
            System.out.println("Você informou algum valor invalido.");
        }

        sc.close();
    }

}

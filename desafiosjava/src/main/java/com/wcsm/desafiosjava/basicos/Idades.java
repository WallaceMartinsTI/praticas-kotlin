package com.wcsm.desafiosjava.basicos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
====================================================
Solucionando Desafios em Java
====================================================
2/3 - Idades
====================================================

Faça um algoritmo para ler um número indeterminado de dados, contendo cada um, a idade de um
indivíduo. O último dado, que não entrará nos cálculos, contém o valor de idade negativa. Calcular
e imprimir a idade média deste grupo de indivíduos.

Entrada
A entrada contém um número indeterminado de inteiros. A entrada será encerrada quando um valor
negativo for lido.

Saída
A saída contém um valor correspondente à média de idade dos indivíduos.

A média deve ser impressa com dois dígitos após o ponto decimal.

--------------------------------------------
| Exemplo de Entrada | Exemplo de Saída    |
--------------------------------------------
| 34                 | 39.25               |
| 56                 |                     |
| 44                 |                     |
| 23                 |                     |
| -2                 |                     |
--------------------------------------------.
*/
class Idades {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe as idades abaixo.");

        List<Integer> idades = new ArrayList<>();

        int index = 1;
        while (true) {
            System.out.printf("Idade %s: ", index);
            String valorInput = sc.nextLine();
            try {
                int valor = Integer.parseInt(valorInput);
                if(valor < 0) {
                    break;
                }
                idades.add(valor);
            } catch (Exception e) {
                System.out.println("Você informou um valor inválido.");
                break;
            }
            index++;
        }

        double media;
        int totalIdades = 0;
        for (int idade : idades) {
            totalIdades += idade;
        }

        media = (double) totalIdades / idades.size();

        System.out.println("Media das idade informadas: " + media);
        sc.close();
    }

}

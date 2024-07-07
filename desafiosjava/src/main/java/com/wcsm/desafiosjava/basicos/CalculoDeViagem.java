package com.wcsm.desafiosjava.basicos;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
====================================================
Solucionando desafios matemáticos em Java
====================================================
1/5 - Cálculo de viagem
====================================================

Desafio
Rubens quer calcular e mostrar a quantidade de litros de combustível gastos em uma viagem de carro,
sendo que seu carro faz 12 KM/L. Como ele não sabe fazer um programa que o auxilie nessa missão,
ele te pede ajuda. Para efetuar o cálculo, deve-se fornecer o tempo gasto em horas na viagem e a
velocidade média durante a mesma em km/h. Assim, você conseguirá passar para Rubens qual a
distância percorrida e, em seguida, calcular quantos litros serão necessários para a viagem que ele
quer fazer. Mostre o valor com 3 casas decimais após o ponto.

Entrada
O arquivo de entrada contém dois inteiros. O primeiro é o tempo gasto na viagem em horas e o
segundo é a velocidade média durante a mesma em km/h.

Saída
Imprima a quantidade de litros necessária para realizar a viagem, com três dígitos após o ponto
decimal

-----------------------------------------
| Exemplo de Entrada | Exemplo de Saída |
| 10 85              | 70.833           |
| 22 67              | 122.833          |
-----------------------------------------
*/
class CalculoDeViagem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas horas de duração tem a viagem?");
        System.out.print("Horas: ");
        Integer horas = Integer.parseInt(sc.nextLine());

        System.out.println("Qual a média em Km/h você faz durante a viagem?");
        System.out.print("Média (Km/h): ");
        Integer media = Integer.parseInt(sc.nextLine());

        int gasto = 12;

        int distancia = horas * media;

        double litrosGastoNaViagem = (double) distancia / gasto;

        System.out.printf("Para realizar a viagem, você irá gastar %.3f Litros de combustível.", litrosGastoNaViagem);

        sc.close();
    }

}

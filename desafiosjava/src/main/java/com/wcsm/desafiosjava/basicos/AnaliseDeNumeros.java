package com.wcsm.desafiosjava.basicos;

import java.util.ArrayList;
import java.util.Scanner;

/*
====================================================
Solucionando desafios matemáticos em Java
====================================================
5/5 - Análise de Números
====================================================

Desafio
Você deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos valores informados
são pares, quantos valores informados são ímpares, quantos valores informados são positivos e
quantos valores informados são negativos. Considere que o número zero é positivo, mas não pode
ser considerado como positivo ou negativo.

Entrada
Você receberá 5 valores inteiros.

Saída
Exiba a mensagem conforme o exemplo de saída abaixo, sendo uma mensagem por linha e não
esquecendo o final de linha após cada uma.

--------------------------------------------
| Exemplo de Entrada | Exemplo de Saída    |
--------------------------------------------
| -5                 | 3 par(es)           |
| 0                  | 2 impar(es)         |
| -3                 | 1 positivo(s)       |
| -4                 | 3 negativo(s)       |
| 12                 |                     |
--------------------------------------------
*/
class AnaliseDeNumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe 5 valores inteiros.");

        System.out.print("Valor 1: ");
        String valor1Input = sc.nextLine();

        System.out.print("Valor 2: ");
        String valor2Input = sc.nextLine();

        System.out.print("Valor 3: ");
        String valor3Input = sc.nextLine();

        System.out.print("Valor 4: ");
        String valor4Input = sc.nextLine();

        System.out.print("Valor 5: ");
        String valor5Input = sc.nextLine();

        try {
            int valor1 = Integer.parseInt(valor1Input);
            int valor2 = Integer.parseInt(valor2Input);
            int valor3 = Integer.parseInt(valor3Input);
            int valor4 = Integer.parseInt(valor4Input);
            int valor5 = Integer.parseInt(valor5Input);

            int[] valores = {valor1, valor2, valor3, valor4, valor5};

            ArrayList<Integer> pares = new ArrayList<>();
            ArrayList<Integer> impares = new ArrayList<>();
            ArrayList<Integer> positivos = new ArrayList<>();
            ArrayList<Integer> negativos = new ArrayList<>();

            for(int valor : valores) {
                if(valor % 2 == 0) {
                    pares.add(valor);
                } else {
                    impares.add(valor);
                }

                if(valor > 0) {
                    positivos.add(valor);
                } else if(valor < 0){
                    negativos.add(valor);
                }
            }

            System.out.println("valores pares: " + pares.size());
            System.out.println("valores impares: " + impares.size());
            System.out.println("valores positivos: " + positivos.size());
            System.out.println("valores negativos: " + negativos.size());
        } catch (Exception e) {
            System.out.println("Você informou algum valor inválido.");
        }
    }

}

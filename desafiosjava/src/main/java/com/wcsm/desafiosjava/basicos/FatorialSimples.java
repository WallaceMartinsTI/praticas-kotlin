package com.wcsm.desafiosjava.basicos;

import java.util.Scanner;

/*
====================================================
Desafio Java - Bootcamp Amdocs 2
====================================================
1/3 - Fatorial Simples
====================================================

Ler um valor N. Calcular e escrever seu respectivo fatorial.
Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.

Entrada
A entrada contém um valor inteiro N (0 < N < 13).

Saída
A saída contém um valor inteiro, correspondente ao fatorial de N.

-----------------------------------------
| Exemplo de Entrada | Exemplo de Saída |
-----------------------------------------
| 4                  | 24               |
-----------------------------------------
*/
class FatorialSimples {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero de 1 a 12 para ver seu fatorial.");

        System.out.print("Numero: ");
        String input = sc.nextLine();

        try {
            int numero = Integer.parseInt(input);

            if(numero <= 0 || numero >= 13) {
                throw new Exception();
            }

            for(int i =(numero - 1); i > 0; i--) {
                numero *= i;
            }

            System.out.println("O fatorial de: " + input + " e " + numero);
        } catch (Exception e) {
            System.out.println("Voce informou um valor invalido.");
        }

        sc.close();
    }

}

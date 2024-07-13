package com.wcsm.desafiosjava.basicos;

import java.io.IOException;
import java.util.Scanner;

/*
====================================================
Solucionando desafios matemáticos em Java
====================================================
2/3 - Seis Números Ímpares
====================================================

Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir de X,
um valor por linha, inclusive o X se for o caso.

Entrada
A entrada será um valor inteiro positivo.

Saída
A saída será uma sequência de seis números ímpares.

--------------------------------------------
| Exemplo de Entrada | Exemplo de Saída    |
--------------------------------------------
| 8                  | 9                   |
|                    | 11                  |
|                    | 13                  |
|                    | 15                  |
|                    | 17                  |
|                    | 19                  |
--------------------------------------------
*/
class SeisNumerosImpares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        String valorInput = sc.nextLine();

        try {
            int x = Integer.parseInt(valorInput);
            int cont = 0;

            while (cont < 12 ) {
                if ( x % 2  == 1) {
                    System.out.println(x);
                }
                cont++;
                x++;
            }
        } catch (Exception e) {
            System.out.println("Valor inválido.");
        }

        sc.close();
    }

}

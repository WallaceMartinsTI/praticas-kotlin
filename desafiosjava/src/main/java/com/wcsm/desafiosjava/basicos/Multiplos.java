package com.wcsm.desafiosjava.basicos;

import java.util.Scanner;

/*
====================================================
Solucionando desafios matemáticos em Java
====================================================
4/5 - Múltiplos
====================================================

Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou
"Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.

Entrada
A entrada contém valores inteiros.

Saída
A saída deve conter uma das mensagens conforme descrito acima.

--------------------------------------------
| Exemplo de Entrada | Exemplo de Saída    |
--------------------------------------------
| 6 24               | Sao Multiplos       |
--------------------------------------------
| 6 25               | Nao sao Multiplos   |
--------------------------------------------
*/
class Multiplos {

    public static void main(String[] args) {
        int valor1, valor2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        String valor1Input = sc.nextLine();

        System.out.print("Informe o segundo valor: ");
        String valor2Input = sc.nextLine();

        try {
            valor1 = Integer.parseInt(valor1Input);
            valor2 = Integer.parseInt(valor2Input);

            boolean eMultiplo = valor2 % valor1 == 0;
            if(eMultiplo) {
                System.out.println("São Múltiplos.");
            } else {
                System.out.println("Não são Múltiplos.");
            }
        } catch (Exception e) {
            System.out.println("Valores inválidos, tente novamente.");
        }
    }

}

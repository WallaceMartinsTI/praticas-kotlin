package com.wcsm.desafiosjava.basicos;

import java.util.Scanner;

/*
====================================================
Desafios matemáticos em Java
====================================================
1/3 - Visita na Feira
====================================================

Desafio
Você está na feira com a sua sacola e parou em uma banca. O feirante lhe entregou pimentões
amarelos e vermelhos. Agora iremos somar os pimetões amarelos e vermelhos para descobrir o total
de pimentões na sacola.  Você receberá 2 inteiros que devem ser lidos e armazenados nas variáveis
A (pimentões amarelos) e B (pimentões vermelhos). Faça a soma de A e B atribuindo o seu resultado
na variável X (total de pimentões). Apresente X como descrito na mensagem de exemplo abaixo. Não
apresente outra mensagem além da mensagem especificada.

Entrada
A entrada contém 2 valores inteiros, separados por um espaço.

Saída
Imprimir a mensagem "X = " (sendo a letra X maiúscula) seguido pelo valor da variável X e pelo
final de linha. Assegure que exista um espaço antes e depois do sinal de igualdade.

--------------------------------------------
| Exemplo de Entrada | Exemplo de Saída    |
--------------------------------------------
| 11 7               | X = 18              |
--------------------------------------------
| -11 6              | X = -5              |
--------------------------------------------
| 11 -2              | X = 9               |
--------------------------------------------
*/
class VisitaNaFeira {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe dois valores inteiros.");

        System.out.print("Valor A: ");
        String inputA = sc.nextLine();

        System.out.print("Valor B: ");
        String inputB = sc.nextLine();

        try {
            int valorA = Integer.parseInt(inputA);
            int valorB = Integer.parseInt(inputB);

            int resultado = valorA + valorB;
            System.out.println("X = " + resultado);
        } catch (Exception e) {
            System.out.println("Valor inválido.");
        }

        sc.close();
    }

}

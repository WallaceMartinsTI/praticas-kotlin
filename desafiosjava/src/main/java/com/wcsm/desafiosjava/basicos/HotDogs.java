package com.wcsm.desafiosjava.basicos;

import java.util.Scanner;

/*
====================================================
Aceleração Global Dev #18 - GFT
====================================================
3/3 - Cachorros-Quentes
====================================================

Em 2012 foi alcançado um novo recorde mundial na famosa Competição de Cachorros-Quentes do Nathan:
o campeão, Joey Chestnut, devorou 68 cachorros-quentes em dez minutos, um aumento incrível em
relação aos 62 sanduíches devorados pelo mesmo Chestnut em 2011.

O restaurante Nathan’s Famous Corporation, localizado no Brooklyn, NY, é o responsável pela
competição. Eles produzem deliciosos cachorros-quentes, mundialmente famosos, mas quando o assunto
é matemática eles não são tão bons. Eles desejam ser listados no Livro de Recordes do Guinness, mas
para isso devem preencher um formulário descrevendo os fatos básicos da competição. Em particular,
eles devem informar o número médio de cachorros-quentes consumidos pelos participantes durante a
competição.
Você pode ajudá-los? Eles prometeram pagá-lo com um dos seus saborosos cachorros-quentes. Dados o
número total de cachorros-quentes consumidos e o número total de participantes na competição, você
deve escrever um programa para determinar o número médio de cachorros-quentes consumidos pelos
participantes.

Entrada
A entrada consiste de uma única linha que contém dois inteiros H e P (1 ≤ H, P ≤ 1000) indicando
respectivamente o número total de cachorros-quentes consumidos e o número total de participantes
na competição.

Saída
Seu programa deve produzir uma única linha com um número racional representando o número médio de
cachorros-quentes consumidos pelos participantes. O resultado deve ser escrito como um número
racional com exatamente dois dígitos após o ponto decimal, arredondado se necessário.

--------------------------------------------
| Exemplo de Entrada | Exemplo de Saída    |
--------------------------------------------
| 10 90              | 0.11                |
--------------------------------------------
| 840 11             | 76.36               |
--------------------------------------------
| 1 50               | 0.02                |
--------------------------------------------
| 34 1000            | 0.03                |
--------------------------------------------
| 35 1000            | 0.04                |
--------------------------------------------
*/
class HotDogs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Media dos Cachorro-quentes.");

        System.out.print("Quantidade de cachorro-quentes: ");
        String hotDogsInput = sc.nextLine();

        System.out.print("Quantidade de participantes: ");
        String participantesInput = sc.nextLine();

        try {
            double hotDogs = Double.parseDouble(hotDogsInput);
            double participantes = Double.parseDouble(participantesInput);

            double hotDogsPorParticipantes = (hotDogs / participantes);
            System.out.printf("Media de cachorro-quentes por participante: %.2f", hotDogsPorParticipantes);
        } catch (Exception e) {
            System.out.println("Um dos valores digitados esta incorreto.");
        }

        sc.close();
    }

}

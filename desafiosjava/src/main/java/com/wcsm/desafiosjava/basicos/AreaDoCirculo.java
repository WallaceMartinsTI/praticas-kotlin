package com.wcsm.desafiosjava.basicos;

import java.util.Scanner;

/*
====================================================
Solucionando desafios matemáticos em Java
====================================================
2/5 - Área do Círculo
====================================================

A fórmula para calcular a área de uma circunferência é: area = π . raio2. Considerando para
este problema que π = 3.14159:

- Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.

Entrada
A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável raio.

Saída
Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme exemplo abaixo, com 4
casas após o ponto decimal. Utilize variáveis de dupla precisão (double). Como todos os problemas,
não esqueça de imprimir o fim de linha após o resultado, caso contrário,
você receberá "Presentation Error".

-----------------------------------------
| Exemplo de Entrada | Exemplo de Saída |
| 2.00               | A=12.5664        |
| 100.64             | A=31819.3103     |
| 150.00             | A=70685.7750     |
-----------------------------------------
*/
class AreaDoCirculo {

    public static void main(String[] args) {

        final double PI = 3.14;

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o raio do circulo: ");
        String input = sc.nextLine();

        try {
            double raio = Double.parseDouble(input);
            double area = PI * (Math.pow(raio, 2));

            System.out.printf("A área do circulo é: %.4f", area);
        } catch (Exception e) {
            System.out.println("Valor inválido.");
        }

        sc.close();
    }

}

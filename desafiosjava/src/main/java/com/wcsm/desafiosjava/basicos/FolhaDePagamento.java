package com.wcsm.desafiosjava.basicos;

import java.util.Scanner;

/*
====================================================
Solucionando desafios matemáticos em Java
====================================================
3/5 - Folha de Pagamento
====================================================

Desafio
Precisamos saber quanto uma determinada empresa deve pagar para seus colaboradores, porém temos
apenas a quantidade de horas trabalhadas e o valor hora. Escreva um programa que leia o número de
um colaborador, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário
desse colaborador. Em seguida, apresente o número e o salário do colaborador, com duas casas
decimais.

Entrada
Você receberá 2 números inteiros e 1 número com duas casas decimais, representando
o número, quantidade de horas trabalhadas e o valor que o funcionário recebe por hora trabalhada.

Saída
Exiba o número e o salário do colaborador, conforme exemplo abaixo, com um espaço em branco antes
e depois da igualdade. No caso do salário, também deve haver um espaço em branco após o $.

--------------------------------------------
| Exemplo de Entrada | Exemplo de Saída    |
--------------------------------------------
| 25                 | NUMBER = 25         |
| 100                | SALARY = U$ 550.00  |
| 5.50               |                     |
--------------------------------------------
| 1                  | NUMBER = 1          |
| 200                | SALARY = U$ 4100.00 |
| 20.50              |                     |
--------------------------------------------
| 6                  | NUMBER = 6          |
| 145                | SALARY = U$ 2254.75 |
| 15.55              |                     |
--------------------------------------------
*/
class FolhaDePagamento {

    public static void main(String[] args) {
        double horasTrabalhadas, valorHora, resultado;
        int numeroColaborador;

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número do colaborador: ");
        String numeroColaboradorInput = sc.nextLine();

        System.out.print("Informe as horas trabalhadas: ");
        String horasTrabalhadasInput = sc.nextLine();

        System.out.print("Informe o valor hora: ");
        String valorHoraInput = sc.nextLine();

        try {
            numeroColaborador = Integer.parseInt(numeroColaboradorInput);
            horasTrabalhadas = Double.parseDouble(horasTrabalhadasInput);
            valorHora = Double.parseDouble(valorHoraInput);

            resultado = horasTrabalhadas * valorHora;

            System.out.println("NUMBER = " + numeroColaborador);
            System.out.printf("SALARY = U$ %.2f", resultado);
        } catch (Exception e) {
            System.out.println("Você informou algum valor inválido. Use o ponto para separar casas decimais \" . \" formato: 25.78.");
        }
    }

}

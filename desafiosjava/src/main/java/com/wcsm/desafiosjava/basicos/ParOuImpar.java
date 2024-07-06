package com.wcsm.desafiosjava.basicos;

import java.util.Scanner;

class ParOuImpar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número para saber se é par ou ìmpar.");
        System.out.print("Número: ");
        String input = scanner.nextLine();

        try {
            int valor = Integer.parseInt(input);
            if(valor % 2 == 0) {
                System.out.println("O número " + valor + " é par.");
            } else {
                System.out.println("O número " + valor + " é ìmpar.");
            }
        } catch (Exception e) {
            System.out.println("Número inválido.");
        }
    }

}

package com.wcsm.desafiosjava.basicos;

import java.util.Random;
import java.util.Scanner;

class AcerteNumero {
    
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        
        int numeroAleatorio = random.nextInt(10) + 1;
        System.out.println("Numero: " + numeroAleatorio);
        int tentativas = 0;
        System.out.println("Tente adivinhar o numero de 1 a 10.");
        while(true) {
            System.out.print("Tentativa: ");
            String input = sc.nextLine();
            try {
                int tentativa = Integer.parseInt(input);
                if(tentativa == numeroAleatorio) {
                    String palavra = tentativas <= 1 ? " tentativa" : " tentativas";
                    System.out.println("Voce acertou apos " + tentativas + palavra + ".");
                    break;
                } else {
                    tentativas++;
                }
            } catch (Exception e) {
                System.out.println("Valor invalido, tente novamente.");
            }
        }
        
        sc.close();
    }
    
}

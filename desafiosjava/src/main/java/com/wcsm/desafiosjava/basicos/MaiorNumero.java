package com.wcsm.desafiosjava.basicos;

import java.util.Scanner;

class MaiorNumero {
    
    public static void main(String[] args) {
        System.out.println("Informe os numeros abaixo, digite 0 para encerrar.");
        Scanner sc = new Scanner(System.in);
        
        int maior = 0;
        while(true) {
            System.out.print("Numero: ");
            String numeroInput = sc.nextLine();
            try {
                int numero = Integer.parseInt(numeroInput);
                if(numero == 0) {
                    break;
                } else if(numero > maior) {
                    maior = numero;
                }
            } catch(Exception e) {
                System.out.println("Voce informou um numero invalido.");
            }
        }
        
        System.out.println("O maior numero informado foi: " + maior);
        sc.close();
    }
    
}

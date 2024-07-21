package com.wcsm.desafiosjava.basicos;

import java.util.Scanner;

class MenorNumero {
    
    public static void main(String[] args) {
        System.out.println("Informe os numeros abaixo, digite 0 para encerrar.");
        Scanner sc = new Scanner(System.in);
        
        int menor = 0;
        boolean primeiroNumero = true;
        while(true) {
            System.out.print("Numero: ");
            String numeroInput = sc.nextLine();
            try {
                int numero = Integer.parseInt(numeroInput);
                if(primeiroNumero) {
                    menor = numero;
                    primeiroNumero = false;
                }
                
                if(numero == 0) {
                    break;
                } else if(numero < menor) {
                    menor = numero;
                }
            } catch(Exception e) {
                System.out.println("Voce informou um numero invalido.");
            }
        }
        
        System.out.println("O menor numero informado foi: " + menor);
        sc.close();
    }
    
}

package com.wcsm.desafiosjava.basicos;

import java.util.Scanner;

class CalculoIMC {

  public static void main(String[] args) {
        System.out.println("Informe seu peso (apenas o Kg sem as gramas).");
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe seu peso: ");
        String pesoInput = sc.nextLine();
        System.out.print("Informe sua altura: ");
        String alturaInput = sc.nextLine();
        try {
            int peso = Integer.parseInt(pesoInput);
            double altura = Double.parseDouble(alturaInput);

            double imc = peso / (altura * altura);
            System.out.printf("Seu IMC e %.2f", imc);
            System.out.println();

            System.out.print("Classificacao: ");
            if(imc < 18.5) {
                System.out.println("Magreza");
            } else if(imc > 18.5 && imc < 24.9) {
                System.out.println("Normal");
            } else if(imc > 24.9 && imc < 29.9) {
                System.out.println("Sobrepeso");
            } else if(imc > 29.9 && imc < 34.9) {
                System.out.println("Obesidade grau I");
            } else if(imc > 34.9 && imc < 39.9) {
                System.out.println("Obesidade grau II");
            } else {
                System.out.println("Obesidade grau III");
            }
        } catch(Exception e) {
            System.out.println("Voce informou um valor invalido.");
        }
        
        sc.close();
    }

}

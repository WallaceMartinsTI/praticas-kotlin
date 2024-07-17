package com.wcsm.desafiosjava.basicos;

import java.util.Scanner;

class Palindromo {
    
    public static void main(String[] args) {
        System.out.println("Palindromo e quando uma palavra tem o mesmo significado quando escrita ao contrario.");
        System.out.println("Informe uma palavra para saber se ela e um Palindromo.");

        System.out.print("Palavra: ");
        Scanner sc = new Scanner(System.in);
      
        String palavra = sc.nextLine().toUpperCase();

        StringBuilder palavraInversa = new StringBuilder();
        int tamanhoPalavra = palavra.length() - 1;
        for(int x = palavra.length(); x > 0; x--) {
            palavraInversa.append(palavra.charAt(tamanhoPalavra));
            tamanhoPalavra--;
        }
        
        if(palavra.contentEquals(palavraInversa)) {
            System.out.println("A palavra " + palavra + " ao inverso e " + palavraInversa + " logo e PALINDROMO.");
        } else {
            System.out.println("A palavra " + palavra + " ao inverso e " + palavraInversa + " logo NAO e PALINDROMO.");
        }

        sc.close();
    }
    
}

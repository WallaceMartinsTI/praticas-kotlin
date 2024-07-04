package com.wcsm.desafiosjava.basicos;

import java.util.Locale;
import java.util.Scanner;

class LeituraCPF {

    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "US"));

        Scanner sc = new Scanner(System.in);

        String[] cpf;// = new String[4];

        System.out.print("CPF (Exemplo: 000.000.000-00): ");
        cpf = sc.nextLine().split("\\.|-");

        for (int i = 0; i < 4; i++) {
            System.out.printf("%s\n",cpf[i]);
        }

        sc.close();
    }

}

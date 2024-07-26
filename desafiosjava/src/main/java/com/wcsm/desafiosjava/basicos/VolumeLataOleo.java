package com.wcsm.desafiosjava.basicos;

class VolumeLataOleo {

    public static void main(String[] args) {

        // V = 3.14 * R * R * A
        double volume, raio, altura;

        raio = 3.2;
        altura = 4.9;
        volume = 3.14 * raio * raio * altura;

        System.out.printf("O volume da lata de óleo é de %.2f m3", volume);
    }

}

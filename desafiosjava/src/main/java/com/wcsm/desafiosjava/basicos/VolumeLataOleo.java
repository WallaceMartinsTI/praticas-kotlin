package com.wcsm.desafiosjava.basicos;

import com.wcsm.desafiosjava.utils.FormatDecimalPlaces;

public class VolumeLataOleo {

    public static void main(String[] args) {

        // V = 3.14 * R * R * A
        double volume, raio, altura;

        raio = 3.2;
        altura = 4.9;
        volume = 3.14 * raio * raio * altura;

        System.out.println("O volume da lata de óleo é de " + FormatDecimalPlaces.formatDecimalPlaces(volume) + " m3");
    }

}

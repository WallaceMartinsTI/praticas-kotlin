package com.wcsm.desafiosjava.basicos;

public class CavaloLevantarMassa {

    public static void main(String[] args) {

        double m, h, t, cavalos;
        m = 21;
        h = 2.2;
        t = 1.4;

        cavalos = (m * h / t) / 745.6999;

        System.out.printf("A quantidade de cavalos necessários é %.2f", cavalos);

    }

}

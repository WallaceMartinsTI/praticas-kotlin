package com.wcsm.desafiosjava.basicos;

import com.wcsm.desafiosjava.utils.FormatDecimalPlaces;

/*
* Criar um programa que calcule a média de salários de uma empresa,
* pedindo ao usuário a grade de funcionários e os salários, e devolvendo
* a média salarial.
*/
class MediaSalarial {

    public static void main(String[] args) {
        double n1, n2, n3, n4, media;

        n1 = 3453.21;
        n2 = 3498.43;
        n3 = 7902.09;
        n4 = 12932.00;

        media = (n1 + n2 + n3 + n4) / 4;

        double result = FormatDecimalPlaces.formatDecimalPlaces(media);
        System.out.println("A média dos salários é de R$" + result);
    }

}

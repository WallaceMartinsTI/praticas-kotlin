package com.wcsm.desafiosjava.basicos;

class AzulejosParede {

    public static void main(String[] args) {
        double hp, lp, ha, la, qtd;

        hp = 2.6;
        lp = 1.6;
        ha = 0.35;
        la = 0.3;

        qtd = (hp * lp) / (ha * la);

        System.out.printf("Quantidade de azulejos necessários para cobrir a parede: %.2f", qtd);
    }

}

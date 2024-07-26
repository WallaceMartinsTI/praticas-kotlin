package com.wcsm.desafiosjava.basicos;

/*
* Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino)
* de 10 pessoas. Fazer um algoritmo que calcule e escreva:
* a. a maior e a menor altura do grupo;
* b. média de altura dos homens;
* c. o número de mulheres.
*/
class FiltroPessoas1 {

    public static void main(String[] args) {
        FiltroPessoas1 filtro1 = new FiltroPessoas1();

        double[][] pessoas = {
                {1.70, 'M'},
                {1.52, 'F'},
                {1.40, 'M'},
                {1.78, 'F'},
                {1.85, 'F'},
                {1.64, 'M'},
                {1.68, 'F'},
                {1.74, 'M'},
                {1.58, 'M'},
                {1.81, 'M'},
        };

        double menorAlturaGrupo = filtro1.menorAlturaCorpo(pessoas);
        System.out.println("Menor altura do grupo: " + menorAlturaGrupo);

        double maiorAlturaGrupo = filtro1.maiorAlturaCorpo(pessoas);
        System.out.println("Maior altura do grupo: " + maiorAlturaGrupo);

        double mediaAlturaHomens = filtro1.mediaAlturaHomens(pessoas);
        System.out.printf("Media de altura entre Homens: %.2f", mediaAlturaHomens);

        int quantidadeMulheres = filtro1.quantidadeMulheres(pessoas);
        System.out.println("No grupo ha " + quantidadeMulheres + " mulheres.");
    }

    private double menorAlturaCorpo(double[][] pessoas) {
        double menor = pessoas[0][0];
        for(double[] pessoa : pessoas) {
            if(pessoa[0] < menor) {
                menor = pessoa[0];
            }
        }
        return menor;
    }

    private double maiorAlturaCorpo(double[][] pessoas) {
        double maior = pessoas[0][0];
        for(double[] pessoa : pessoas) {
            if(pessoa[0] > maior) {
                maior = pessoa[0];
            }
        }
        return maior;
    }

    private double mediaAlturaHomens(double[][] pessoas) {
        int qtdHomens = 0;
        double alturas = 0.0;

        for (double[] pessoa : pessoas) {
            if (pessoa[1] == 'M') {
                qtdHomens++;
                alturas += pessoa[0];
            }
        }

        return alturas / qtdHomens;
    }

    private int quantidadeMulheres(double[][] pessoas) {
        int qtdMulheres = 0;
        for (double[] pessoa : pessoas) {
            if(pessoa[1] == 'F') {
                qtdMulheres++;
            }
        }
        return qtdMulheres;
    }



}

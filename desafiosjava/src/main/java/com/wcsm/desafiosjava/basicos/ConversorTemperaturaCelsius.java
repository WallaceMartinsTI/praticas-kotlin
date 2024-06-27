package com.wcsm.desafiosjava.basicos;

import java.text.DecimalFormat;

/*
* Escreva um programa que, com base em uma temperatura em graus celsius,
* a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F),
* seguindo as fórmulas:
* F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67
*/
class ConversorTemperaturaCelsius {

    public static void main(String[] args) {
        ConversorTemperaturaCelsius conversor = new ConversorTemperaturaCelsius();

        double celsiusTemp = 2.43;

        double kelvinTemp = conversor.celsiusToKelvin(celsiusTemp);
        double reaumurTemp = conversor.celsiusToReaumur(celsiusTemp);
        double rankineTemp = conversor.celsiusToRankine(celsiusTemp);
        double fahrenheitTemp = conversor.celsiusToFahrenheit(celsiusTemp);

        System.out.println("=========================================================");
        System.out.println("Convertendo a temperatura " + celsiusTemp + " °C (graus Celsius)");
        System.out.println("=========================================================");
        System.out.println("Para KELVIN: " + conversor.formatDecimalPlaces(kelvinTemp) + " K");
        System.out.println("---------------------------------------------------------");
        System.out.println("Para REAUMUR: " + conversor.formatDecimalPlaces(reaumurTemp) + " °Re");
        System.out.println("---------------------------------------------------------");
        System.out.println("Para RANKINE: " + conversor.formatDecimalPlaces(rankineTemp) + " °Ra");
        System.out.println("---------------------------------------------------------");
        System.out.println("Para FAHRENHEIT: " + conversor.formatDecimalPlaces(fahrenheitTemp) + "°F");
        System.out.println("=========================================================");

    }

    private double celsiusToKelvin(double celsius) {
        // K = C + 273.15
        return celsius + 273.15;
    };

    private double celsiusToReaumur(double celsius) {
        // Re = C * 0.8
        return celsius * 0.8;
    };

    private double celsiusToRankine(double celsius) {
        // Ra = C * 1.8 + 32 + 459.67
        return celsius * 1.8 + 32 + 459.67;
    };

    private double celsiusToFahrenheit(double celsius) {
        // F = C * 1.8 + 32
        return celsius * 1.8 + 32;
    };

    private String formatDecimalPlaces(Double value) {
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(value);
    }

};



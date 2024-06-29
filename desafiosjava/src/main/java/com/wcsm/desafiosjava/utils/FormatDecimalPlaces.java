package com.wcsm.desafiosjava.utils;

import java.text.DecimalFormat;

public class FormatDecimalPlaces {

    // 23.84739434 to 23.85
    public static double formatDecimalPlaces(Double value) {
        DecimalFormat df = new DecimalFormat("#.##");
        String result = df.format(value);
        return Double.parseDouble(result);
    }

}

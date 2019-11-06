package com.olbati;

import java.util.*;
import java.util.stream.Collectors;

public class RomanNumeralsConversion {

    private Map<Integer, String> config = new TreeMap<>(Collections.reverseOrder());

    public RomanNumeralsConversion () {
        config.put(1, "I");
        // config.put(2,"II");
        // config.put(3,"III");
        config.put(4, "IV");
        config.put(5, "V");
        //config.put(6,"VI");
        //config.put(7,"VII");
        //config.put(8,"VIII");
        config.put(9, "IX");
        config.put(10, "X");
        config.put(40, "XL");
        config.put(50, "L");
        config.put(90, "XC");
        config.put(100, "C");
        config.put(400, "CD");
        config.put(500, "D");
        config.put(900, "CM");
        config.put(1000, "M");

    }

    public String normalToRomanConvertor (int normalNumber) {

        int normalNumberBeta = normalNumber;
        String romanValue = "";


        for (Map.Entry<Integer, String> entry : config.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();

            while (normalNumberBeta >= key && normalNumberBeta > 0) {
                System.out.println("Key Value : (" + key + "," + value + ")");
                System.out.println("Before : (" + romanValue + "," + normalNumberBeta + ")");
                romanValue = romanValue + value;
                normalNumberBeta = normalNumberBeta - key;
                System.out.println("After : (" + romanValue + "," + normalNumberBeta + ")");
                System.out.println("\n");
            }
        }

        return romanValue;


   /*     if(normalNumber == 1){
            romanValue = "I";
        }
        else if (normalNumber == 2){
            romanValue = "II";
        }
        else if (normalNumber == 3){
            romanValue = "III";
        }
        else if (normalNumber == 4){
            romanValue = "IV";
        }
        else if (normalNumber == 5){
            romanValue = "V";
        }
        else if (normalNumber == 6){
            romanValue = "VI";
        }
        else if (normalNumber == 7){
            romanValue = "VII";
        }
        else if (normalNumber == 8){
            romanValue = "VIII";
        }
        else if (normalNumber == 9){
            romanValue = "IX";
        }
        else if (normalNumber == 10){
            romanValue = "X";
        }

        return romanValue;*/
    }
}

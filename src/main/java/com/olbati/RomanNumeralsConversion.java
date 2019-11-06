package com.olbati;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class RomanNumeralsConversion {

private SortedMap<Integer,String> config = new TreeMap<>();

    public RomanNumeralsConversion(){
        config.put(1,"I");
        config.put(2,"II");
        config.put(3,"III");
        config.put(4,"IV");
        config.put(5,"V");
        config.put(6,"VI");
        config.put(7,"VII");
        config.put(8,"VIII");
        config.put(9,"IX");
        config.put(10,"X");
    }


    public String normalToRomanConvertor(int normalNumber){

        int normalNumberBeta = normalNumber;
        String romanValue = "" ;

        for(Map.Entry<Integer,String> entry : config.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();

            while (normalNumberBeta <= key && normalNumberBeta > 0){
                romanValue = romanValue+value;
                normalNumberBeta = normalNumberBeta - key;
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

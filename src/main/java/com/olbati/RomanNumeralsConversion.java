package com.olbati;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class RomanNumeralsConversion {

    private Map<Integer, String> config = new TreeMap<>(Collections.reverseOrder());

    public RomanNumeralsConversion () {
        config.put(1, "I");
        config.put(4, "IV");
        config.put(5, "V");
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

        int normalNumberValue = normalNumber;
        StringBuilder romanNumberValue = new StringBuilder();

        if (normalNumberValue <= 3000) {
            for (Map.Entry<Integer, String> entry : config.entrySet()) {
                Integer key = entry.getKey();
                String value = entry.getValue();

                while (normalNumberValue >= key && normalNumberValue > 0) {
                    romanNumberValue.append(value);
                    normalNumberValue = normalNumberValue - key;
                }
            }
        }
        return romanNumberValue.toString();
    }
}

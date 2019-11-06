package com.olbati;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class RomanNumeralsConversion {

    private Map<Integer, String> romanNumeralsconfig = new TreeMap<>(Collections.reverseOrder());

    public RomanNumeralsConversion () {
        romanNumeralsconfig.put(1, "I");
        romanNumeralsconfig.put(4, "IV");
        romanNumeralsconfig.put(5, "V");
        romanNumeralsconfig.put(9, "IX");
        romanNumeralsconfig.put(10, "X");
        romanNumeralsconfig.put(40, "XL");
        romanNumeralsconfig.put(50, "L");
        romanNumeralsconfig.put(90, "XC");
        romanNumeralsconfig.put(100, "C");
        romanNumeralsconfig.put(400, "CD");
        romanNumeralsconfig.put(500, "D");
        romanNumeralsconfig.put(900, "CM");
        romanNumeralsconfig.put(1000, "M");
    }

    public String normalToRomanConvertor (int normalNumber) {

        int normalNumberValue = normalNumber;
        StringBuilder romanNumberValue = new StringBuilder();
        Integer mapKey;
        String mapValue;

        if (normalNumberValue <= 3000) {
            for (Map.Entry<Integer, String> entry : romanNumeralsconfig.entrySet()) {
                mapKey = entry.getKey();
                mapValue = entry.getValue();

                while (normalNumberValue >= mapKey && normalNumberValue > 0) {
                    romanNumberValue.append(mapValue);
                    normalNumberValue = normalNumberValue - mapKey;
                }
            }
        }
        return romanNumberValue.toString();
    }
}

package com.calcJm;

import java.util.Map;
import java.util.TreeMap;

public class RomanNumbers {

    final static TreeMap<Integer, String> romanMap = new TreeMap<Integer, String>();

    static {
        romanMap.put(10, "X");
        romanMap.put(9, "IX");
        romanMap.put(8, "VIII");
        romanMap.put(7, "VII");
        romanMap.put(6, "VI");
        romanMap.put(5, "V");
        romanMap.put(4, "IV");
        romanMap.put(3, "III");
        romanMap.put(2, "II");
        romanMap.put(1, "I");
    }

    public final static int toArab(String roman) {
        int result = 0;
        for (Map.Entry<Integer, String> entry : romanMap.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();

            if (roman.equals(value)) {
                result = key;
            }
        }
        return result;
    }

    public final static String toRoman(int arab) {
        return romanMap.get(arab);
    }

}

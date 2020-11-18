package com.calcJm;

import java.util.Map;
import java.util.TreeMap;

public class RomanNumbers {

    final static TreeMap<Integer, String> romanMap = new TreeMap<Integer, String>();

    static {
        romanMap.put(1000, "M");
        romanMap.put(900, "CM");
        romanMap.put(500, "D");
        romanMap.put(400, "CD");
        romanMap.put(100, "C");
        romanMap.put(90, "XC");
        romanMap.put(50, "L");
        romanMap.put(40, "XL");
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

    public final static String toRoman(int number) {
        int l = romanMap.floorKey(number);
        if (number == l) {
            return romanMap.get(number);
        }
        return romanMap.get(l) + toRoman(number - l);
    }


}


/*
    public final static String to1Roman(int arab) {
        //IX + V = 14 (XIV)

        if (arab <= 10) {
            return romanMap.get(arab);
        } else {
            int decimal = arab / 10;
            System.out.println(decimal);
            int digit = arab % 10;
            System.out.println(digit);
            StringBuilder sb = new StringBuilder();
            String result = sb.append(romanMap.get(decimal*10)).append(romanMap.get(digit)).toString();
            return result;
        }
    }*/

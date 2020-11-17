package com.calcJm;

import java.util.regex.Pattern;

public class Calculator {

    String expression;
    int a;
    int b;
    String sign;
    boolean isArab = false;

    Calculator(String expression) {
        this.expression = expression;
        String[] words = expression.split(" ");


        for (String word : words) {
            if (Pattern.matches("\\d+", word)) {
                isArab = true;
            }
        }

        //если пользователь ввел числа не арабские,
        //тогда переводим введенные римские в арабские, чтобы можно было считать
        if (!isArab) {
            this.a = RomanNumbers.toArab(words[0]);
            this.b = RomanNumbers.toArab(words[2]);
            this.sign = words[1];
        } else {
            this.a = Integer.parseInt(words[0]);
            this.b = Integer.parseInt(words[2]);
            this.sign = words[1];
        }
    }

    String sum() {
        int result = a + b;
        if (!isArab) {
            return RomanNumbers.toRoman(result);
        } else {
            return String.valueOf(result);
        }
    }

    String diff() {
        int result = a - b;
        if (!isArab) {
            return RomanNumbers.toRoman(result);
        } else {
            return String.valueOf(result);
        }
    }

    String mult() {
        int result = a * b;
        if (!isArab) {
            return RomanNumbers.toRoman(result);
        } else {
            return String.valueOf(result);
        }
    }

    String div() {
        if (b == 0) {
            throw new IllegalArgumentException("BOOOOOOOM!!111 Do not divide by zer0!");
        }
        int result = a / b;
        if (!isArab) {
            return RomanNumbers.toRoman(result);
        } else {
            return String.valueOf(result);
        }
    }
}

package com.calcJm;

public class Calculator {

    String expression;
    String a;
    String b;
    String sign;

    Calculator(String expression) {
        this.expression = expression;
        String[] words = expression.split(" ");
        this.a = words[0];
        this.b = words[2];
        this.sign = words[1];
    }

    int sum() {
        return Integer.parseInt(a) + Integer.parseInt(b);
    }

    int diff() {
        return Integer.parseInt(a) - Integer.parseInt(b);
    }

    int mult() {
        return Integer.parseInt(a) * Integer.parseInt(b);
    }

    int div() {
        if (b.equals("0")) {
            throw new IllegalArgumentException("BOOOOOOOM!!111 Do not divide by zer0!");
        }
        return Integer.parseInt(a) / Integer.parseInt(b);
    }
}

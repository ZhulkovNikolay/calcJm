package com.calcJm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //String userInput = bufferedReader.readLine();
        String userInput = "66 / 33";
        bufferedReader.close();
        Calculator calculator = new Calculator(userInput);

        switch (calculator.sign) {
            case "+" -> System.out.println(userInput + " = " + calculator.sum());
            case "-" -> System.out.println(userInput + " = " + calculator.diff());
            case "*" -> System.out.println(userInput + " = " + calculator.mult());
            case "/" -> System.out.println(userInput + " = " + calculator.div());
        }
    }
}

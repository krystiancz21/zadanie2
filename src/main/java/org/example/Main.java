package org.example;

import static org.example.StringSplitAndCalculate.splitAndCalculate;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Zadanie 2");
        String input = "1,2.3;4+";
        double output = splitAndCalculate(input);
        System.out.println("Wynik: " + output);
    }
}
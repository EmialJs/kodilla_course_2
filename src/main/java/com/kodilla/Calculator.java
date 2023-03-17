package com.kodilla;

public class Calculator {

    public static void main(String[] args) {

        int number1 = 5;
        int number2 = 3;

        int resultAdd = add(number1, number2);
        int resultSubtract = subtract(number1, number2);

        System.out.println("Wynik dodawania: " + resultAdd);
        System.out.println("Wynik odejmowania: " + resultSubtract);
    }

    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    public static int subtract(int number1, int number2) {
        return number1 - number2;
    }
}


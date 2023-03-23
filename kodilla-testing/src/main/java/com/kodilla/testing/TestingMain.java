package com.kodilla.testing;
import.

    public class TestingMain {
        public static void main(String[] args) {
            Calculator calculator = new Calculator();

            int result = calculator.add(3, 5);
            if (result == 8) {
                System.out.println("Addition test OK");
            } else {
                System.out.println("Addition test Error!");
            }

            result = calculator.subtract(7, 3);
            if (result == 4) {
                System.out.println("Subtraction test OK");
            } else {
                System.out.println("Subtraction test Error!");
            }
        }
    }

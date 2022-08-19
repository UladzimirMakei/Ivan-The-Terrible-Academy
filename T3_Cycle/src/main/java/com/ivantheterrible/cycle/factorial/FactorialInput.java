package com.ivantheterrible.cycle.factorial;

import java.util.Scanner;

import static java.lang.System.out;

public class FactorialInput {
    public static int inputValue() {
        boolean successfulInput = false;
        int valueInput = '0';
        do {
            try {
                valueInput = greetingAndScanning();
                successfulInput = isInputFactorialCorrect(valueInput);
                if (!successfulInput)
                    out.println("Factorial can be calculated only for numbers => 0. Please try again");
            } catch (Exception e) {
                out.println("Your number input is not correct. Please try again");
            }
        } while (!successfulInput);
        return valueInput;
    }

    private static int greetingAndScanning() {
        out.println("Enter a number to find its factorial: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static boolean isInputFactorialCorrect(int number) {
        return 0 <= number;
    }
}

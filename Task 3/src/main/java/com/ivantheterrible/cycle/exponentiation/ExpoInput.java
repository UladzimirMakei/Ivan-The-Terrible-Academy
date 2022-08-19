package com.ivantheterrible.cycle.exponentiation;

import java.util.Scanner;

import static java.lang.Math.*;
import static java.lang.System.out;

public class ExpoInput {
    public static int inputValue() {
        boolean successfulInput = false;
        int valueInput = '0';
        do {
            try {
                valueInput = greetingAndScanning();
                successfulInput = isNumberExponentiationOfTwo(valueInput);
                if (!successfulInput)
                    out.println("Entered number is not a exponentiation of 2. Please try again");
            } catch (Exception e) {
                out.println("Your number input is not correct. Please try again");
            }
        } while (!successfulInput);
        return valueInput;
    }

    private static int greetingAndScanning() {
        out.println("Enter a number to find its exponentiation of 2: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static boolean isNumberExponentiationOfTwo(int number) {
        return (log10(number)/ log10(2)) % 1 == 0;
    }
}

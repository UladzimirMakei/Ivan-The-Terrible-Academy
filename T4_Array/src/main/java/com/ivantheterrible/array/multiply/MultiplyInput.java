package com.ivantheterrible.array.multiply;

import java.util.Scanner;

import static java.lang.System.out;

public class MultiplyInput {
    public static int inputValue() {
        boolean successfulInput = false;
        int valueInput = '0';
        do {
            try {
                valueInput = greetingAndScanning();
                successfulInput = true;
            } catch (Exception e) {
                out.println("Your input is not correct. Please try again");
            }
        } while (!successfulInput);
        return valueInput;
    }

    private static int greetingAndScanning() {
        out.println("\nEnter a number to multiply array: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}

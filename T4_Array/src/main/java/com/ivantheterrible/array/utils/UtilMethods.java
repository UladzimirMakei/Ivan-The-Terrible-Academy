package com.ivantheterrible.array.utils;

import java.util.Scanner;

import static com.ivantheterrible.array.multiply.MultiplyArray.isArrayNotNull;
import static java.lang.System.out;

public class UtilMethods {
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

    public static void printArray(int[] array) {
        if (isArrayNotNull(array)) {
            for (int i : array) {
                out.print(i + " ");
            }
        }
    }

    public static void printArray(String[] array) {
        for (String i : array) {
            out.print(i + " ");
        }
    }
}

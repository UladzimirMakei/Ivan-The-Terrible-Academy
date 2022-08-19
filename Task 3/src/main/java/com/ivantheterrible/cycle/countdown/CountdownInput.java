package com.ivantheterrible.cycle.countdown;

import java.util.Scanner;

import static java.lang.System.out;

public class CountdownInput {
    public static int inputValue() {
        boolean successfulInput = false;
        int valueInput = '0';
        do {
            try {
                valueInput = greetingAndScanning();
                successfulInput = isNumberInputCorrect(valueInput);
            } catch (Exception e) {
                out.println("Your year input is not correct. Please try again");
            }
        } while (!successfulInput);
        return valueInput;
    }

    private static int greetingAndScanning() {
        out.println("Enter a number for countdown: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static boolean isNumberInputCorrect(int number) {
        return number >= 0;
    }
}

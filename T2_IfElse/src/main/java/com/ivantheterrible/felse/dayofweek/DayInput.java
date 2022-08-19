package com.ivantheterrible.felse.dayofweek;

import java.util.Scanner;

import static java.lang.System.out;

public class DayInput {
    public static int inputValue() {
        boolean successfulInput;
        String dayOfWeek;
        do {
            dayOfWeek = greetingAndScanning();
            successfulInput = isInputCorrect(dayOfWeek);
        } while (!successfulInput);
        return Integer.parseInt(dayOfWeek);
    }

    private static String greetingAndScanning() {
        out.println("Enter a number [1-7] to find out the day of the week: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static boolean isInputCorrect(String operationInput) {
        return (operationInput.length() == 1) && (isNumberWithinLimit(operationInput));
    }

    private static boolean isNumberWithinLimit(String number) {
        boolean result = false;
        switch (number.charAt(0)) {
            case '1', '2', '3', '4', '5', '6', '7' -> result = true;
        }
        return result;
    }
}

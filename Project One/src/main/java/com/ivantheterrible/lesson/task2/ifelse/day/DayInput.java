package com.ivantheterrible.lesson.task2.ifelse.day;

import java.util.Scanner;

import static java.lang.System.out;

public class DayInput {

    public static int inputValue() {
        boolean successfulInput = false;
        String dayOfWeek;
        do {
            dayOfWeek = greetingAndScanning();
            if (isInputCorrect(dayOfWeek)) {
                successfulInput = true;
            } else out.println("Your input is not correct. Please try again");
        } while (!successfulInput);
        return Integer.parseInt(dayOfWeek);
    }

    public static String greetingAndScanning() {
        out.println("Enter a number [1-7] to find out the day of the week: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static boolean isInputCorrect(String operationInput) {
        return (operationInput.length() == 1) && (isNumberWithinLimit(operationInput));
    }

    public static boolean isNumberWithinLimit(String number) {
        boolean result = false;
        switch (number.charAt(0)) {
            case '1', '2', '3', '4', '5', '6', '7' -> result = true;
        }
        return result;
    }
}

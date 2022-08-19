package com.ivantheterrible.felse.leapyear;

import java.util.Scanner;

import static java.lang.System.out;

public class YearInput {
    public static int inputValue() {
        boolean successfulInput = false;
        int valueInput = '0';
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                valueInput = scanner.nextInt();
                successfulInput = true;
            } catch (Exception e) {
                out.println("Your year input is not correct. Please try again");
            }
        } while (!successfulInput);
        return valueInput;
    }
}

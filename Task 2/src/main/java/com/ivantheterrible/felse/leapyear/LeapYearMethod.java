package com.ivantheterrible.felse.leapyear;

public class LeapYearMethod {
    public static String checkLeapYear(int year) {
        boolean result = false;
        if (isYearDivisible(year, 4)) {
            result = !isYearDivisible(year, 100) || isYearDivisible(year, 400);
        }
        if (result) {
            return "a leap year!";
        } else return "not a leap year!";
    }

    private static boolean isYearDivisible(int year, int number) {
        return year % number == 0;
    }
}
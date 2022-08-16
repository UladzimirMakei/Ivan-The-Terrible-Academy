package com.ivantheterrible.lesson.task2.ifelse.leap;

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

    public static boolean isYearDivisible(int year, int number) {
        return year % number == 0;
    }
}
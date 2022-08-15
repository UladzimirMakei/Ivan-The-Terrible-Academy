package com.ivantheterrible.lesson.task2.ifelse;

public class LeapYearMethod {
    public static String checkLeapYear(int year) {
        boolean result = false;
        if (divideChecking(year, 4)) {
            result = !divideChecking(year, 100) || divideChecking(year, 400);
        }
        if (result) {
            return "a leap year!";
        } else return "not a leap year!";
    }

    public static boolean divideChecking(int year, int number) {
        return year % number == 0;
    }
}
package com.ivantheterrible.lesson.task2.ifelse.day;

public class DayOfTheWeek {
    public static String getDayOfTheWeek(int day) {
        String result = "Monday";
        switch (day) {
            case 2 -> result = "Tuesday";
            case 3 -> result = "Wednesday";
            case 4 -> result = "Thursday";
            case 5 -> result = "Friday";
            case 6 -> result = "Saturday";
            case 7 -> result = "Sunday";
        }
        return result;
    }
}

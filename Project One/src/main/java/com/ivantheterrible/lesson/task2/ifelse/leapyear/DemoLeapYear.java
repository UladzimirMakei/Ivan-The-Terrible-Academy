package com.ivantheterrible.lesson.task2.ifelse.leapyear;

import static com.ivantheterrible.lesson.task2.ifelse.leapyear.LeapYearMethod.checkLeapYear;
import static java.lang.System.out;

public class DemoLeapYear {
    public static void main(String[] args) {
        // ввод года для проверки
        out.println("Enter year to check: ");
        int year = YearInput.inputValue();
        // вывод результата проверки
        out.format("%s is %s", year, checkLeapYear(year));
    }
}

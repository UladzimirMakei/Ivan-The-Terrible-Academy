package com.ivantheterrible.lesson.task2.ifelse;

import static com.ivantheterrible.lesson.task2.ifelse.LeapYearMethod.checkLeapYear;
import static java.lang.System.out;

public class Demo {
    public static void main(String[] args) {
        // ввод года для проверки
        out.println("Enter year to check: ");
        int year = YearInput.inputValue();
        // вывод рещультата проверки
        out.format("%s is %s", year, checkLeapYear(year));
    }
}

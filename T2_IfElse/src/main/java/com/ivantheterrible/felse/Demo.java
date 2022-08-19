package com.ivantheterrible.felse;

import com.ivantheterrible.felse.dayofweek.DayInput;
import com.ivantheterrible.felse.divisibility.NumberInput;
import com.ivantheterrible.felse.leapyear.YearInput;

import static com.ivantheterrible.felse.dayofweek.DayOfTheWeek.getDayOfTheWeek;
import static com.ivantheterrible.felse.divisibility.DivisibilityMethod.numberDivisibility;
import static com.ivantheterrible.felse.leapyear.LeapYearMethod.checkLeapYear;
import static java.lang.System.out;

public class Demo {
    public static void main(String[] args) {
        // Задача №1 - Дни недели
        // ввод значение для получения эквивалентного дня недели
        int day = DayInput.inputValue();
        // вывод результата проверки
        out.format("Your number %s is equal to %s!\n", day, getDayOfTheWeek(day));

        // Задача №2 - Кратность на 2, 3, 5
        // ввод числа
        int number = NumberInput.inputValue();
        // вывод результата проверки
        out.format("%s is %s\n", number, numberDivisibility(number));

        // Задача №3 - Високосный год
        // ввод года для проверки
        out.println("Enter year to check: ");
        int year = YearInput.inputValue();
        // вывод результата проверки
        out.format("%s is %s", year, checkLeapYear(year));
    }
}

package com.ivantheterrible.lesson.task2.ifelse.day;

import static com.ivantheterrible.lesson.task2.ifelse.day.DayOfTheWeek.*;
import static java.lang.System.out;

public class DemoDays {
    public static void main(String[] args) {
        // ввод значение для получения эквивалентного дня недели
        int day = DayInput.inputValue();
        // вывод результата проверки
        out.format("Your number %s is equal to %s!", day, getDayOfTheWeek(day));
    }
}

package com.ivantheterrible.lesson.task2.ifelse.divisibility;

import static com.ivantheterrible.lesson.task2.ifelse.divisibility.DivisibilityMethod.numberDivisibility;
import static java.lang.System.out;

public class DemoDivisibility {
    public static void main(String[] args) {
        // ввод числа для проверки кратности на 2,3,5
        int number = NumberInput.inputValue();
        // вывод результата проверки
        out.format("%s is %s", number, numberDivisibility(number));
    }
}

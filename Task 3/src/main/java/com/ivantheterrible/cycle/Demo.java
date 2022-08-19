package com.ivantheterrible.cycle;

import com.ivantheterrible.cycle.countdown.CountdownInput;
import com.ivantheterrible.cycle.exponentiation.ExpoInput;
import com.ivantheterrible.cycle.exponentiation.ExpoMethod;
import com.ivantheterrible.cycle.factorial.FactorialInput;
import com.ivantheterrible.cycle.factorial.FactorialMethod;

import static com.ivantheterrible.cycle.countdown.CountdownMethod.numberCountdown;
import static java.lang.System.out;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        //Задача №1 - Факториал
        //ввод числа для нахождения его фактриала
        int number = FactorialInput.inputValue();
        // вывод результата проверки
        int result = FactorialMethod.numberFactorial(number);
        out.format("Factorial of %s is %s\n", number, result);

        //Задача №2 - Степень числа 2
        // ввод числа
        int expoNumber = ExpoInput.inputValue();
        // вывод результата
        int expoResult = ExpoMethod.exponentiationOfTwo(expoNumber);
        out.format("Number %s is 2 to the power of %s\n", expoNumber, expoResult);

        //Задача №3 - Обратный отсчет
        // ввод числа
        int countNumber =  CountdownInput.inputValue();
        // вывод обратного отсчета
        numberCountdown(countNumber);
    }
}

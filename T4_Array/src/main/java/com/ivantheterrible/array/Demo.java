package com.ivantheterrible.array;

import static com.ivantheterrible.array.multiply.MultiplyArray.*;
import static com.ivantheterrible.array.utils.UtilMethods.*;
import static com.ivantheterrible.array.utils.UtilMethods.printArray;
import static java.lang.System.*;

public class Demo {
    public static void main(String[] args) {
        //Задача №1 - Умножение массива
        //Исходный массив
        int[] arrayTaskOne = {1, -5, 8, 9, 0, -2};
        printArray(arrayTaskOne);
        //Ввод множителя
        int multiply = inputValue();
        //Расчет и вывод результата
        out.println("After multiplication: ");
        multiplyArray(arrayTaskOne, multiply);

        //Задача №2 - Содержит ли массив данную букву
        //Исходный массив
        String[] arrayTaskTwo = {"max", "vova", "lera", "ivan", "muhhammad"};
        out.println("\nTask #2: ");
        printArray(arrayTaskTwo);
        out.println("What letter would you like to find: ");
    }
}

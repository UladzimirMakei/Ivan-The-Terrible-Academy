package com.ivantheterrible.array;

import com.ivantheterrible.array.multiply.MultiplyInput;

import static com.ivantheterrible.array.multiply.MultiplyArray.*;
import static java.lang.System.*;

public class Demo {
    public static void main(String[] args) {
        //Задача №1 - Умножение массива
        //Исходный массив
        int [] arrayTaskOne = {1, -5 , 8 , 9, 0 , -2};
        printArray(arrayTaskOne);
        //Ввод множителя
        int multiply = MultiplyInput.inputValue();
        //Расчет и вывод результата
        out.println("After multiplication: ");
        multiplyArray(arrayTaskOne, multiply);
    }
}

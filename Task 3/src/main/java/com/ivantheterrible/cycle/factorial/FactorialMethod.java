package com.ivantheterrible.cycle.factorial;

public class FactorialMethod {
    public static int numberFactorial(int number) {
        int result = 1;
        for(int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}

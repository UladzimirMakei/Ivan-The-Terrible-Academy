package com.ivantheterrible.cycle.exponentiation;

public class ExpoMethod {
    public static int exponentiationOfTwo (int number) {
        int expo = 0;
        while (number != 1) {
            number /= 2;
            expo+= 1;
        }
        return expo;
    }
}

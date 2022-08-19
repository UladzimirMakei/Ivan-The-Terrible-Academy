package com.ivantheterrible.felse.divisibility;

public class DivisibilityMethod {
    public static StringBuilder numberDivisibility(int numberInput) {
        int[] array = {2, 3, 5};
        StringBuilder result = new StringBuilder("divisible by ");
        for (int values : array) {
            resultOfDivisibility(result, numberInput, values);
        }
        return result;
    }

    private static void resultOfDivisibility(StringBuilder result, int numberOne, int numberTwo) {
        if (isNumberDivisible(numberOne, numberTwo))
            result.append(numberTwo).append("  ");
    }

    public static boolean isNumberDivisible(int numberOne, int numberTwo) {
        return numberOne % numberTwo == 0;
    }
}
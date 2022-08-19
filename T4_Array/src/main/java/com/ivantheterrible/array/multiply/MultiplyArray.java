package com.ivantheterrible.array.multiply;

import static java.lang.System.*;

public class MultiplyArray {
    public static void multiplyArray(int[] array, int number) {
        if (isArrayNotNull(array)) {
            for (int i = 0; i < array.length; i++)
                array[i] = multiplyArrayNumber(array[i], number);
            printArray(array);
        } else out.println("Array format is not correct");
    }

    public static void printArray(int[] array) {
        if (isArrayNotNull(array)) {
            for (int i : array) {
                out.print(i + " ");
            }
        }
    }

    private static boolean isArrayNotNull(int[] array) {
        return array != null;
    }

    private static int multiplyArrayNumber(int arrayNumber, int multiplyNumber) {
        if (isResultCorrect(arrayNumber, multiplyNumber))
            arrayNumber *= multiplyNumber;
        return arrayNumber;
    }

    private static boolean isResultCorrect(int arrayNumber, int multiplyNumber) {
        return (double) arrayNumber * multiplyNumber < Integer.MAX_VALUE
                && (double) arrayNumber * multiplyNumber > Integer.MIN_VALUE;
    }
}

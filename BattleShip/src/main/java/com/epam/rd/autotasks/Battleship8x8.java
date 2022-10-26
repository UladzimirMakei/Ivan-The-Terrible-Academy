package com.epam.rd.autotasks;

public class Battleship8x8 {
    private final long ships;
    private long shots = 0L;

    public Battleship8x8(final long ships) {
        this.ships = ships;
    }

    public boolean shoot(String shot) {
        return false;
    }

    public String state() {
        throw new UnsupportedOperationException();
    }

    public int[] buildArray(long number) {
        String twoBiteNumber = Long.toBinaryString(number);
        int[] array = new int[64];
        for (int i = 64 - twoBiteNumber.length(), j = 0; i < array.length; i++, j++) {
            array[i] = Character.getNumericValue((twoBiteNumber.charAt(j)));
        }
        return array;
    }

    public int buildShot(String shot) {
        int result = 0;
        switch (shot.charAt(0)) {
            case 'A':
                result += rowNumber(shot);
                break;
            case 'B':
                result += 1 + rowNumber(shot);
                break;
            case 'C':
                result += 2 + rowNumber(shot);
                break;
            case 'D':
                result += 3 + rowNumber(shot);
                break;
            case 'E':
                result += 4 + rowNumber(shot);
                break;
            case 'F':
                result += 5 + rowNumber(shot);
                break;
            case 'G':
                result += 6 + rowNumber(shot);
                break;
            case 'H':
                result += 7 + rowNumber(shot);
                break;

        }
        return result;
    }

    private int rowNumber(String shot) {
        int result = 0;
        switch (shot.charAt(1)) {
            case '1':
                result = 0;
                break;
            case '2':
                result = 8;
                break;
            case '3':
                result = 16;
                break;
            case '4':
                result = 24;
                break;
            case '5':
                result = 32;
                break;
            case '6':
                result = 40;
                break;
            case '7':
                result = 48;
                break;
            case '8':
                result = 56;
                break;
        }
        return result;
    }
}

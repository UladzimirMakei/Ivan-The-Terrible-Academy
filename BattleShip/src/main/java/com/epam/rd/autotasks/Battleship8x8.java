package com.epam.rd.autotasks;

public class Battleship8x8 {
    private final long ships;
    private long shots = 0L;

    public long getShots() {
        return shots;
    }

    public Battleship8x8(final long ships) {
        this.ships = ships;
    }

    public boolean shoot(String shot) {
        int shotNumber = buildByteNumberShot(shot);
        String currentShip = Long.toBinaryString(ships);
        this.shots = updateShot(shot);
        return (currentShip.charAt(shotNumber) == '1');
    }

    public String state() {
        StringBuilder result = new StringBuilder();
        int[] battlefield = buildByteArrayFromLong(ships);
        int[] shotMemory = buildByteArrayFromLong(shots);
        for (int i = 0; i < battlefield.length; i++) {
            if (i % 8 == 0) {
                result.append("\n");
            }
            if (battlefield[i] == 0) {
                if (shotMemory[i] == 0) {
                    result.append(".");
                } else if (shotMemory[i] == 1) {
                    result.append("×");
                }
            } else if (battlefield[i] == 1) {
                if (shotMemory[i] == 0) {
                    result.append("☐");
                } else if (shotMemory[i] == 1) {
                    result.append("☒");
                }
            }
        }
        return result.toString();
    }

    public long updateShot(String shot) {
        int [] oldShotArray = buildByteArrayFromLong(this.shots);
        int byteShot = buildByteNumberShot(shot);
        int [] newShot = buildShotArray(byteShot);
        for (int i = 0; i < oldShotArray.length; i++){
            if(newShot[i] == 1){
                oldShotArray[i] = 1;
            }
        }
        return arrayToNumber(oldShotArray);
    }

    public Long arrayToNumber(int[] array) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            result.append(array[i]);
        }
        return Long.parseLong(result.toString());
    }

    public int[] buildShotArray(long number) {
        int[] array = new int[64];
        array[(int) number] = 1;
        return array;
    }

    public int[] buildByteArrayFromLong(long number) {
        String twoBiteNumber = Long.toBinaryString(number);
        int[] array = new int[64];
        for (int i = 64 - twoBiteNumber.length(), j = 0; i < array.length; i++, j++) {
            array[i] = Character.getNumericValue((twoBiteNumber.charAt(j)));
        }
        return array;
    }

    public int buildByteNumberShot(String shot) {
        return (shot.codePointAt(0) - 65) + (Character.getNumericValue(shot.codePointAt(1)) - 1) * 8;
    }
}

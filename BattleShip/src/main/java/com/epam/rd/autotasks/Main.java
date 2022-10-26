package com.epam.rd.autotasks;

public class Main {
    public static void main(String[] args) {
        long number = 0b01000000_01000000_01000000_01000000_00001110_00000001_00000100_00000000L;
        Battleship8x8 battle = new Battleship8x8(number);
        int[] array = battle.buildArray(number);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        String alpha = "A1";
        long shot = battle.buildShot(alpha);
        System.out.println("\n" + shot);
        System.out.println(battle.shoot(alpha));
    }
}

package com.epam.rd.autotasks;

public class Main {
    public static void main(String[] args) {
        long number = -1150950973573693440L;
        Battleship8x8 battle = new Battleship8x8(number);
        int[] array = battle.buildArray(number);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        String alpha = "B1";
        int shot = battle.buildShot(alpha);
        System.out.println("\n" + shot);
    }
}

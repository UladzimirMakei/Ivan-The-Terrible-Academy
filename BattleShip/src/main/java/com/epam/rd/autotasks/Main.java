package com.epam.rd.autotasks;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Long number = -1150950973573693440L;
        Battleship8x8 battle = new Battleship8x8(number);
        battle.shoot("A1");
        System.out.println(battle.state());

    }
}

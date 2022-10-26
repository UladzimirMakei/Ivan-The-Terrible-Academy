package com.epam.rd.autotasks;

public class Battleship8x8 {
    private final long ships;
    private long shots = 0L;

    public Battleship8x8(final long ships) {
        this.ships = Math.abs(ships);
    }

    public boolean shoot(String shot) {
        return false;
    }

    public String state() {
        throw new UnsupportedOperationException();
    }
}

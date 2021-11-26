package cad.lab6.nomer7_17;

import java.util.Random;

public class Dice {

    public int roll() {
        return new Random().nextInt(6) + 1;
    }
}

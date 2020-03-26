package jc01_2020.classwork.ships_semaphore;

import java.util.Random;

public class ShipGenerator implements Runnable {
    private Random random = new Random();

    private Ship shipGenerator() {
        return new Ship(Size.values()[random.nextInt(Size.values().length)]);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            shipGenerator().start();
        }
    }
}

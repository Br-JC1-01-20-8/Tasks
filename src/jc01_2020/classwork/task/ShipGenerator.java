package jc01_2020.classwork.task;

import java.util.Random;

public class ShipGenerator implements Runnable {
    private Random random = new Random();
    private int shipCount;
    private Tunnel tunnel;

    public ShipGenerator(int shipCount, Tunnel tunnel) {
        this.shipCount = shipCount;
        this.tunnel = tunnel;
    }

    public Ship shipGenerator() {
        Ship ship = new Ship(Type.values()[random.nextInt(Type.values().length)], Size.values()[random.nextInt(Size.values().length)]);
        return ship;
    }

    @Override
    public void run() {
        for (int i = 0; i < shipCount; i++) {
            Ship newShip = shipGenerator();
            try {
                tunnel.addShip(newShip);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(String.format("Корабль добавлен, везет товар %s вместимосью %s", newShip.getType(), newShip.getSize().getSize()));
        }
    }
}

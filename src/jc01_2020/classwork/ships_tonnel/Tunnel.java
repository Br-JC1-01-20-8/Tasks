package jc01_2020.classwork.ships_tonnel;

import java.util.ArrayList;
import java.util.List;

public class Tunnel {
    private int sizeTunnel = 5;
    List<Ship> list = new ArrayList<>();

    public synchronized void addShip(Ship ship) throws InterruptedException {
        if (list.size() < sizeTunnel) {
            list.add(ship);
        } else {
            System.out.println("Тунель заполнен");
            wait();
        }
    }

    public synchronized Ship getShip(Type type) {
        for (Ship ship : list) {
            if (ship.getType().equals(type)) {
                System.out.println(String.format("Возьмем корабль вместительностью %s %s", ship.getSize().getSize(), ship.getType()));
                list.remove(ship);
                notifyAll();
                return ship;
            }
        }
        return null;
    }
}

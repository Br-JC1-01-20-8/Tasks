package jc01_2020.classwork.ships_tonnel;

public class Pier implements Runnable {
    private Type type;
    private Tunnel tunnel;

    public Pier(Type type, Tunnel tunnel) {
        this.type = type;
        this.tunnel = tunnel;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Ship ship = tunnel.getShip(type);
                if (ship != null) {
                    load(ship);
                } else {
                    Thread.sleep(100);
                }
            }
        } catch (InterruptedException e) {
            e.getStackTrace();
        }
    }

    private void load(Ship ship) throws InterruptedException {
        int currentLoad = 0;
        while (ship.getSize().getSize() > currentLoad) {
            currentLoad = currentLoad + 10;
            Thread.sleep(100);
//            System.out.println(String.format("Идет загрузка корабля товаром %s загруженно %s ", ship.getType(), currentLoad));
        }
        System.out.println(String.format("Корабль загружен %s единицами товара %s",currentLoad,ship.getType()));
    }
}

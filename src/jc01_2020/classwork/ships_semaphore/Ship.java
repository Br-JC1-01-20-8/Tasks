package jc01_2020.classwork.ships_semaphore;

import java.util.concurrent.Semaphore;

public class Ship extends Thread  {

    private static final Semaphore SEMAPHORE = new Semaphore(5, true);

    private Size size;

    Ship(Size size){
        this.size = size;
    }

    @Override
    public void run() {
        try {
            SEMAPHORE.acquire();
            this.load();
            SEMAPHORE.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    private void load() throws InterruptedException {
        int currentLoad = 0;
        System.out.println("Идет загрузка корабля");
        while (size.getSize() > currentLoad) {
            currentLoad = currentLoad + 10;
            Thread.sleep(100);
//            System.out.println(String.format("Идет загрузка корабля товаром %s загруженно %s ", ship.getType(), currentLoad));
        }
        System.out.println(String.format("Корабль загружен %s единицами товара",currentLoad));
    }
}

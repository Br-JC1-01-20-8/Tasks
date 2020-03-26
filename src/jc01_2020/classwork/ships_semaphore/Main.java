package jc01_2020.classwork.ships_semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ShipGenerator shipGenerator = new ShipGenerator();
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        executorService.execute(shipGenerator);
    }
}

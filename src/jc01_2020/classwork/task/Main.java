package jc01_2020.classwork.task;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Tunnel tunnel = new Tunnel();
        ShipGenerator shipGenerator = new ShipGenerator(2,tunnel);
        Pier pier1 = new Pier(Type.BANANA,tunnel);
        Pier pier2 = new Pier(Type.COCONUT,tunnel);
        Pier pier3 = new Pier(Type.MANGO,tunnel);
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        executorService.execute(pier1);
        executorService.execute(pier2);
        executorService.execute(pier3);
        executorService.execute(shipGenerator);
    }
}

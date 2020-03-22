package jc01_2020.classwork.multithreading.task01;

import java.util.List;
import java.util.Optional;

public class Buyer extends Thread {

    private String good;
    private int processTime;
    private volatile List<Cashbox> cashboxes;

    public Buyer(String good, List<Cashbox> cashboxes) {
        this.good = good;
        this.cashboxes = cashboxes;
    }

    public Buyer(String good, int processTime, List<Cashbox> cashboxes) {
        this.good = good;
        this.processTime = processTime;
        this.cashboxes = cashboxes;
    }

    @Override
    public void run() {
        Optional<Cashbox> cashboxOptional = getFreeCashbox();
        while (!cashboxOptional.isPresent()) {
            try {
                Thread.sleep(10);
                cashboxOptional = getFreeCashbox();
            } catch (InterruptedException ignored) {
            }
        }

        Cashbox cashbox = cashboxOptional.get();
        cashbox.setFree(false);
        synchronized (cashbox) {
            try {
                Thread.sleep(processTime != 0 ? processTime : 1000);
                System.out.println(String.format("I bought %s in the cashbox # %s for %s ms", good, cashbox.getNumber(), processTime));
                cashbox.setFree(true);
            } catch (InterruptedException ignored) {
            }
        }
    }

    private Optional<Cashbox> getFreeCashbox() {
        return cashboxes.stream()
                .filter(Cashbox::isFree)
                .findAny();
    }
}

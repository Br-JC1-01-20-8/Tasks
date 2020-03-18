package jc01_2020.classwork.multithreading.wait;

public class Reader extends Thread {
    final Calculator c;
    public Reader(Calculator calc) { c = calc;  }

    public void run() {
        System.out.println("Reader run before synchronized");
        synchronized (c) {
            try {
                System.out.println("Вычисление...");
                c.wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
            System.out.println("Total равно: " + c.total);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Calculator calculator = new Calculator();
        System.out.println("Run first reader thread");
        new Reader(calculator).start();
        Thread.sleep(500);
        System.out.println("Run second reader thread");
        new Reader(calculator).start();
        Thread.sleep(500);
        System.out.println("Run third reader thread");
        new Reader(calculator).start();
        Thread.sleep(500);
        System.out.println("Run calculator thread");
        calculator.start();
        System.out.println("Finish");
    }

}



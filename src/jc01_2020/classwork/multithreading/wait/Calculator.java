package jc01_2020.classwork.multithreading.wait;

class Calculator extends Thread {
    int total;
    public void run() {
        System.out.println("Calculator run before synchronized");
        synchronized (this) {
            System.out.println("Calculator run in synchronized");
            for (int i = 0; i < 100; i++) { total += i; }
            notifyAll();
        }
        System.out.println("Calculator run after synchronized");
    }
}

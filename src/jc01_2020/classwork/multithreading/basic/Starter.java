package jc01_2020.classwork.multithreading.basic;

public class Starter {

    public static void main(String[] args) throws InterruptedException {
        NameRunnable nr = new NameRunnable();
        Thread one = new Thread(nr);
        Thread two = new Thread(nr);
        Thread three = new Thread(nr);

        one.setName("Первый");
        two.setName("Второй");
        three.setName("Третий");

        one.start();
        System.out.println("one.start()");
        two.start();
        System.out.println("two.start()");
        three.start();
        System.out.println("three.start()");


    }

    static class NameRunnable implements Runnable {
        public void run() {
            for (int x = 1; x <= 100; x++) {
                System.out.println("Запущен " + Thread.currentThread().getName() + ", x равен " + x);
            }
        }
    }


}

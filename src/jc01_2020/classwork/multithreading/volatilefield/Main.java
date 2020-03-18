package jc01_2020.classwork.multithreading.volatilefield;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Multi multi = new Multi();
        Thread thread1 = new Thread(multi);
        Thread thread2 = new Thread(multi);

        thread1.start();
        thread2.start();

        Thread.sleep(2000);

        multi.cancel();

        System.out.println("End of Main");

    }

}

package jc01_2020.classwork.multithreading.volatilefield;

public class Multi implements Runnable {

    private volatile boolean isCancel = false;

    public void cancel() {
        isCancel = true;
    }

    @Override
    public void run() {
        while (!isCancel) {}
        System.out.println("End of Multi");
    }
}

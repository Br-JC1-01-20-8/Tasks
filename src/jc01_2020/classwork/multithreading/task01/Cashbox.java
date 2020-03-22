package jc01_2020.classwork.multithreading.task01;

public class Cashbox {

    private boolean isFree = true;
    private int number;

    public Cashbox(int number) {
        this.number = number;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public int getNumber() {
        return number;
    }
}

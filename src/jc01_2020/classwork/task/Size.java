package jc01_2020.classwork.task;

public enum Size {
            SIZE10(10),
            SIZE50(50),
            SIZE100(100);

    public int getSize() {
        return size;
    }

    private int size;

    Size(int size) {
        this.size = size;
    }
}

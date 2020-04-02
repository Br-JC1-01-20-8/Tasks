package jc01_2020.classwork.junit;

public class Math {

    private Logic logic;
    private String string;

    public Math(Logic logic, String string) {
        this.logic = logic;
        this.string = string;
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public int otherSum(int a, int b) {
        return logic.getSomething() + logic.getSomething() + a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

}

package jc01_2020.lesson14.examples.classwork;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Vasya", LocalDate.of(2020, 3, 9), 1);
        Helper.storeEmployee(emp1);
    }
}

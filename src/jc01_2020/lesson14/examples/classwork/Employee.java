package jc01_2020.lesson14.examples.classwork;

import java.time.LocalDate;

public class Employee {
    private String name;
    private LocalDate birthDate;
    private int depNumber;

    public Employee(String name, LocalDate birthDate, int depNumber) {
        this.name = name;
        this.birthDate = birthDate;
        this.depNumber = depNumber;
    }

    public String getName() {
        return name;
    }
}

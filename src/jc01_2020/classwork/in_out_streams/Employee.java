package jc01_2020.classwork.in_out_streams;

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

    public void setName(final String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(final LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getDepNumber() {
        return depNumber;
    }

    public void setDepNumber(final int depNumber) {
        this.depNumber = depNumber;
    }
}

package jc01_2020.classwork.date.examples;

import java.time.LocalDate;

public class Date {
    LocalDate now;
    public Date() {
        now = LocalDate.now();
    }
    public void increment() {
        now = now.plusDays(1);
    }
}

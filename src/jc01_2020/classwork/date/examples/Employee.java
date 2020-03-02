package jc01_2020.classwork.date.examples;

import java.time.LocalDate;

public class Employee {
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean isNotified;

    public Employee(String name, LocalDate startDate, int years) {
        this.name = name;
        this.startDate = startDate;
        endDate = startDate.plusYears(years);
    }
    public void fire() {
        endDate = LocalDate.now();
    }
    public void notified() {
        isNotified = true;
    }
    public String checkTerm(LocalDate now) {
        if(!isNotified && !now.isAfter(endDate) && !now.plusDays(60).isBefore(endDate)) {
            return name + ", тебе скоро уволят!!!";
        } return null;
    }
    public boolean isFire(LocalDate now) {
        return !isNotified && !now.isAfter(endDate) && !now.plusDays(60).isBefore(endDate);
    }
}


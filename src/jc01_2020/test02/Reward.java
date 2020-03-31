package jc01_2020.test02;

import java.io.Serializable;
import java.time.LocalDate;

public class Reward implements Serializable {

    // Это не трогайте
    private static final long serialVersionUID = 2708444340168537086L;

    private LocalDate date;
    private String name;

    public Reward(LocalDate date, String name) {
        this.date = date;
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

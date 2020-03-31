package jc01_2020.test02;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class Повар implements Employee, Serializable {

    private String name;
    private Department department;
    private LocalDate startDate;
    private LocalDate endDate;
    private int workPeriod;
    private List<Reward> rewards;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getWorkPeriod() {
        return workPeriod;
    }

    public void setWorkPeriod(int workPeriod) {
        this.workPeriod = workPeriod;
    }

    public List<Reward> getRewards() {
        return rewards;
    }

    public void setRewards(List<Reward> rewards) {
        this.rewards = rewards;
    }

}

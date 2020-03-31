package jc01_2020.test02;

import java.time.LocalDate;
import java.util.List;

public interface Employee {

    String getName();
    void setName(String name);
    Department getDepartment();
    void setDepartment(Department department);
    LocalDate getStartDate();
    void setStartDate(LocalDate startDate);
    LocalDate getEndDate();
    void setEndDate(LocalDate endDate);
    int getWorkPeriod();
    void setWorkPeriod(int workPeriod);
    List<Reward> getRewards();
    void setRewards(List<Reward> rewards);

}

package jc01_2020.test02;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface Employee {

    long serialVersionUID = 1208444340168537086L;
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

    default long calculateWorkPeriod() {
        return Duration.between(LocalDateTime.from(getStartDate().atStartOfDay()), LocalDateTime.from(getEndDate().atStartOfDay())).toDays();
    }

    default String print() {
        return "Employee{\n" +
                "name='" + getName() + '\'' + "\n" +
                ", department=" + getDepartment() + '(' + getDepartment().getValue() + ')' + "\n" +
                ", startDate=" + getStartDate() + "\n" +
                ", endDate=" + getEndDate() + "\n" +
                ", workPeriod=" + getWorkPeriod() + "\n" +
                ", rewards=" + getRewards().toString() + "\n" +
                '}';
    }
}

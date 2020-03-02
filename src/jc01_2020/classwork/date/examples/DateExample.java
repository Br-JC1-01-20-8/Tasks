package jc01_2020.classwork.date.examples;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DateExample {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        StartWork startWork = Employee::new;
        employees.add(startWork.hire("Boris Johnson", LocalDate.of(2019, 3, 10), 1));

        Scanner scanner = new Scanner(System.in);

        Date now = new Date();

        while (true) {
            if (scanner.nextLine().equals("Exit")) {
                break;
            }
            List<Employee> fired = new ArrayList<>();

            String result = employees.stream()
                    .filter(employee -> employee.isFire(now.now))
                    .peek(fired::add)
                    .map(employee -> employee.checkTerm(now.now))
                    .filter(Objects::nonNull)
                    .collect(Collectors.joining("\n"));
            System.out.println(now.now);
            System.out.println(result);
            fired.forEach(Employee::notified);
            now.increment();
        }
    }

}

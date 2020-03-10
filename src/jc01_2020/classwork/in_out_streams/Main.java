package jc01_2020.classwork.in_out_streams;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        Employee emp1 = new Employee("Vasya", LocalDate.of(2020, 3, 9), 1);
//        Helper.storeEmployee(emp1);
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        while (continueLoop) {
            System.out.println("Какое действие вы хотите выполнить?");
            System.out.println("1 - добавить сотрудника");
            System.out.println("2 - перевести его в другой отдел");
            System.out.println("3 - уволить сотрудника");
            System.out.println("4 - проверить, есть ли сегодня у кого-нибудь день рождения");
            System.out.println("5 - выйти");

            switch (scanner.nextInt()) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                default:
            }
        }
    }
}

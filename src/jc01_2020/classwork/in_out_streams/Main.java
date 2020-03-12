package jc01_2020.classwork.in_out_streams;

import java.util.Scanner;

import static jc01_2020.classwork.in_out_streams.Helper.*;

public class Main {


    public static void main(String[] args) {
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
                    addEmployee();
                    break;
                case 2:
                    moveToDep();
                    break;
                case 3:
                    fireEmployee();
                    break;
                case 4:
                    checkBirthday();
                    break;
                case 5:
                    continueLoop = false;
                default:
            }
        }
    }
}

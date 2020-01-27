package jc01_2020.zaretski.lesson02;

/*
*
* Среди трех чисел найти среднее по величине
* Вывести на экран среднее значение. В комбинации чисел "-8, 10, 10" среднее по величине число - 10.
* Учитывайте возможность ввода отрицательных чисел
*
* Формат вывода (ошибки недопустимы):
* одно число
*
*/

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        if ((first <= second && first >= third) || (first <= third && first >= second)) {
            System.out.print(first);
        } else if ((second <= first && second >= third) || (second <= third && second >= first)) {
            System.out.print(second);
        } else {
            System.out.println(third);
        }
    }
}

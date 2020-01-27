package jc01_2020.zaretski.lesson02;

/*
 *
 * Делится ли введенное число на 3 без остатка
 * С клавиатуры вводится число. Вывести на экран делится ли оно на 3 без остатка
 *
 * Формат вывода (ошибки недопустимы):
 * "Делится"
 * "Не делится"
 *
 */

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long numeric = scanner.nextLong();

		if (numeric % 3 == 0) {
			System.out.print("Да");
		} else {
			System.out.print("Нет");
		}
	}
}

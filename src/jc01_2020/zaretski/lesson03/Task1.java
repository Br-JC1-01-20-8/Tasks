package jc01_2020.zaretski.lesson03;

/*
 *
 * С клавиатуры вводится натуральное число. Найти его наибольшую цифру
 *
 * Формат вывода (ошибки недопустимы):
 * одно число
 *
 */

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long input = scanner.nextLong();
		long number;
		long max = 0;

		if (input < 0) {
			input = -input;
		}

		do {
			number = input % 10;
			if (number > max) {
				max = number;
			}
			input = input / 10;
		} while (input > 0);

		System.out.println(max);
	}
}

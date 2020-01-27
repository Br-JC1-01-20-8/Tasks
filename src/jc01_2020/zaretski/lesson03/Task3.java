package jc01_2020.zaretski.lesson03;

/*
 *
 * Сформировать из введенного числа обратное по порядку входящих в него цифр и вывести на экран.
 * Например, если введено число 3486, то надо вывести число 6843.
 *
 * Формат вывода (ошибки недопустимы):
 * одно число с учетом знака
 *
 */

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long input = scanner.nextLong();
		long result = 0;

		boolean isNegative = input < 0;
		if (isNegative) {
			input = -input;
		}

		do {
			result = result * 10 + input % 10;
			input = input / 10;
		} while (input > 0);

		if (isNegative) {
			result = -result;
		}

		System.out.println(result);
	}
}

package jc01_2020.zaretski.lesson03;

/*
 *
 * Угадать случайное число
 * В программе генерируется случайное целое число от 0 до 100. Пользователь должен его отгадать не более чем за 10 попыток.
 * После каждой неудачной попытки должно сообщаться больше или меньше введенное пользователем число, чем то, что загадано.
 * Если за 10 попыток число не отгадано, то вывести загаданное число.
 *
 * Теста на это задание нет, поиграйтесь сами против компьютера
 *
 */

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int secret = (int) (Math.random() * 100 + 1);
		int input;
		System.out.println("Я загадал число. Попробуйте его угадать!");

		for (int i = 0; i < 10; i++) {
			input = scanner.nextInt();
			if (input == secret) {
				System.out.println("Вы угадали, это число " + input);
				return;
			}
			String str = secret > input ? "Загаданное число больше" : "Загаданное число меньше";
			System.out.println(str);
		}
		System.out.println("Попытки закончились. Было загадано число " + secret);
	}
}

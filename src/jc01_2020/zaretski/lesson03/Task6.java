package jc01_2020.zaretski.lesson03;

/*
 *
 * Вывести на экран "прямоугольник", образованный из двух видов символов.
 * Контур прямоугольника должен состоять из одного символа, а "заливка" - из другого.
 *
 * Теста нет, смотрим вывод в консоль
 *
 */

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int horizontal = scanner.nextInt();
		int vertical = scanner.nextInt();
		for (int i = 0; i < vertical; i++) {
			for (int j = 0; j < horizontal; j++) {
				if (i == 0 || i == vertical - 1) {
					System.out.print("X");
				} else {
					if (j == 0 || j == horizontal - 1) {
						System.out.print("X");
					} else {
						System.out.print("-");
					}
				}
			}
			System.out.println();
		}
	}
}

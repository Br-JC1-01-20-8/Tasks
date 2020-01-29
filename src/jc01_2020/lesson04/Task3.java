package jc01_2020.lesson04;

/*
 *
 * Найти индекс минимального по модулю элемента массива.
 *
 * Пример: {10, -3, -5, 2, 5}. Минимальным по модулю элементом является число 2. Его индекс 3 (т.к. индексация массивов
 * начинается с нуля)
 *
 * Формат вывода:
 * одно число
 *
 */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
    }
}

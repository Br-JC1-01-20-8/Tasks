package jc01_2020.lesson05;

/*
 *
 * Преобразовать регулярное выражение таким образом, чтобы повторяющийся символ '.' перед символом '@' был
 * недопустим.
 *
 * abc.@gmail.com - допустимый вариант
 * abc..@  abc...@ и т.д. - недопустимый вариант
 *
 * Вывести в консоль результат выполнения метода matcher.find()
 *
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();

		String regexp = "^[a-zA-Z0-9]+[\\w\\.-]+[\\w&&[^_]]{1}@{1}[a-zA-Z]+\\.{1}[a-zA-Z]+";

		Pattern pattern = Pattern.compile(regexp);
		Matcher matcher = pattern.matcher(str);

		System.out.println(matcher.find());
	}
}

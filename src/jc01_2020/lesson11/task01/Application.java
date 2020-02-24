package jc01_2020.lesson11.task01;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.Random;

/*
 *
 *	В методе main перехватить и подавить исключения NullPointerException и FileNotFoundException, но не перехватывать другие.
 * 	Метод invokeMethodWithException не менять
 *
 */

public class Application {

	public static void main(String[] args) throws Exception {
		invokeMethodWithException();
	}

	private static void invokeMethodWithException() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {
		int i = new Random().nextInt(4);
		if (i == 0) {
			throw new NullPointerException();
		} else if (i == 1) {
			throw new ArithmeticException();
		} else if (i == 2) {
			throw new FileNotFoundException();
		} else if (i == 3) {
			throw new URISyntaxException("", "");
		}
	}

}

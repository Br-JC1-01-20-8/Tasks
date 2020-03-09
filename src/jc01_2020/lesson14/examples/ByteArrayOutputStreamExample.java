package jc01_2020.lesson14.examples;

import java.io.ByteArrayOutputStream;

public class ByteArrayOutputStreamExample {

	public static void main(String[] args) {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		String text = "Hello World!";
		byte[] buffer = text.getBytes();
		try {
			bos.write(buffer);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// Преобразование массива байтов в строку
		System.out.println(bos.toString());

		// Вывод в консоль посимвольно
		byte[] array = bos.toByteArray();
		for (byte b : array) {
			System.out.print((char) b);
		}
		System.out.println();
	}

}

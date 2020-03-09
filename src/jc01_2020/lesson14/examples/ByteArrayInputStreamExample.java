package jc01_2020.lesson14.examples;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamExample {

	public static void main(String[] args) {
		byte[] array1 = new byte[]{1, 3, 5, 7};
		ByteArrayInputStream bis1 = new ByteArrayInputStream(array1);
		int b;
		while ((b = bis1.read()) != -1)
			System.out.println(b);

		String text = "Hello world!";
		byte[] array2 = text.getBytes();
		ByteArrayInputStream bis2 = new ByteArrayInputStream(array2, 0, 5);
		while ((b = bis2.read()) != -1)
			System.out.println((char) b);
	}

}

package jc01_2020.lesson14.examples;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

	public static void main(String[] args) {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		String text = "Hello Wolrd!";
		byte[] buffer = text.getBytes();
		try {
			bos.write(buffer);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			FileOutputStream fos = new FileOutputStream("resource/hello.txt");
			bos.writeTo(fos);
			byte[] array = {'\n', 'c', 'o', 'o', 'l'};
			fos.write(array);
			fos.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}

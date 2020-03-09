package jc01_2020.lesson14.examples;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamExample {

	public static void main(String[] args) {
		try {

//			InputStream fis = new FileInputStream("C:\\test_dir\\test.txt");
//			InputStream fis = new FileInputStream("src/jc01_2020/lesson14/examples/test.txt");
			InputStream fis = new FileInputStream("resource/test.txt");
			System.out.println("Размер файла: " +
					fis.available() + " байт(а)");
			int i;
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}
			fis.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		System.out.println();

		try {

			FileInputStream fis = new FileInputStream("resource/test.txt");

			byte[] buffer = new byte[fis.available()];
			// чтение файла в буфер
			fis.read(buffer, 0, fis.available());

			System.out.println("Содержимое файла:");
			for (final byte b : buffer) {
				System.out.print((char) b);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}


	}

}

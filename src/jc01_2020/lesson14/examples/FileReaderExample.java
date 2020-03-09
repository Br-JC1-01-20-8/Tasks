package jc01_2020.lesson14.examples;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderExample {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("resource/test.txt");
			Scanner scanner = new Scanner(reader);
			while (scanner.hasNextLine()) {
				System.out.print(scanner.nextLine());
			}
			reader.close();
			scanner.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}

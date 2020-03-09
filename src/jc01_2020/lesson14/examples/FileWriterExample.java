package jc01_2020.lesson14.examples;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("resource/file-writer-example.txt", true);
			writer.write("New string");
			writer.write("\n");
			writer.close();
		} catch (IOException e) {
			throw new RuntimeException();
		}
	}

}

package jc01_2020.lesson14.examples;

import java.io.CharArrayReader;

public class CharArrayReaderExample {

	public static void main(String[] ag) throws Exception {
		char[] array = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 't', 'h', 'e', ' ', 'b', 'e', 's', 't'};
		CharArrayReader reader = new CharArrayReader(array);
		int k = 0;
		// Read until the end of a file
		while ((k = reader.read()) != -1) {
			char ch = (char) k;
			System.out.print(ch + " : ");
			System.out.println(k);
		}

		reader = new CharArrayReader(array);
		char[] result = new char[4];
		reader.read(result);
		System.out.println(result);
	}

}

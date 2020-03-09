package jc01_2020.lesson14.examples;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {

	public static void main(String[] args) {

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("resource/person.dat"))) {
			Person p = new Person("Sam", 33, 178, true);
			oos.writeObject(p);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}


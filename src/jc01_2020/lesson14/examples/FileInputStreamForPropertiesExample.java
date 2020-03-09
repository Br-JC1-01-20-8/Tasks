package jc01_2020.lesson14.examples;

import java.io.*;
import java.util.Properties;

public class FileInputStreamForPropertiesExample {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("resource/data.properties");
			Reader reader = new InputStreamReader(is, "UTF-8");
			Properties props = new Properties();
			props.load(reader);

			System.out.println(
					props.getProperty("company") + ", "
							+ props.getProperty("manager"));

			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

package jc01_2020.classwork.in_out_streams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Helper {

	private static final String DATABASE_PATH = "src/jc01_2020/classwork/in_out_streams/database";

	public static void storeEmployee(Employee employee) {
		try {
			FileOutputStream fos = new FileOutputStream(buildFilePath(employee.getName()));
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(employee);
		} catch (IOException e) {
		}
	}

	public static Employee getEmployee(String name) {
		String fileName = getFileName(name);
		return null;
	}

	private static String buildFilePath(final String employeeName) {
		return String.format("%s/%s.txt", DATABASE_PATH, employeeName);
	}

	private static String getFileName(String employeeName) {
		try {
			return Files.list(Paths.get(DATABASE_PATH))
					.map(Path::getFileName)
					.map(Path::toString)
					.filter(path -> path.startsWith(employeeName))
					.findAny()
					.get();
		} catch (IOException e) {
		}
		return null;
	}
}

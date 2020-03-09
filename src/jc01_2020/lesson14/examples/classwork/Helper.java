package jc01_2020.lesson14.examples.classwork;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Helper {

    public static void storeEmployee(Employee employee) {
        try {
            FileOutputStream fos = new FileOutputStream("src/jc01_2020/lesson14/examples/classwork/" + employee.getName() + ".txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(employee);
        } catch (IOException e) {
        }
    }

    public static Employee getEmployee(String name) {
        Files.list(Paths.get("src/jc01_2020/lesson14/examples/classwork"))
                .filter(path -> path.getFileName().startsWith(name))
                .findAny()
                .get();

    }
}

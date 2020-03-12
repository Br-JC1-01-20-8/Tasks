package jc01_2020.classwork.in_out_streams;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Helper {

    private static final String DATABASE_PATH = "src/jc01_2020/classwork/in_out_streams/database";

    public static void storeEmployee(Employee employee) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(buildFilePath(employee.getName())))) {
            oos.writeObject(employee);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Employee getEmployee(String name) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(buildFilePath(name)))) {
            return (Employee) ois.readObject();
        } catch (Exception e) {
            System.out.println(e);
        }
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

    public static void addEmployee() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name");
        String name = sc.nextLine();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("Enter date of birth. Format: dd.MM.yyyy");
        LocalDate birthDate = LocalDate.parse(sc.nextLine(), dtf);

        System.out.println("Enter department number");
        int depNumber = sc.nextInt();

        Employee employee = new Employee(name, birthDate, depNumber);
        storeEmployee(employee);
    }


    public static void fireEmployee() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name");
        String name = sc.nextLine();

        File file = new File(DATABASE_PATH + "/" + getFileName(name));
        if (file.delete()) {
            System.out.printf("Employee %s has been fired", name);
            System.out.println();
        } else {
            System.out.printf("Employee with name %s is absent", name);
            System.out.println();
        }
    }

    public static void moveToDep() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name");
        String name = sc.nextLine();

        System.out.println("Enter new department");
        int depNumber = sc.nextInt();

        Employee employee = getEmployee(name);
        if (employee != null) {
            employee.setDepNumber(depNumber);
            storeEmployee(employee);
        } else {
            System.out.printf("Employee with name %s is absent", name);
            System.out.println();
        }
    }

    public static void checkBirthday() {

    }
}

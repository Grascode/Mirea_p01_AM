package homework3;

import homework2.Passport;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class FileSearch {
    public static ArrayList<String> list = new ArrayList<>();

    public static void getFilesFromDirectory(String way, String extension) {
        File directory = new File(way);
        File[] files = directory.listFiles();
        assert files != null;
        for (File file : files) {
            String path = file.getAbsolutePath();
            if (file.isDirectory()) {
                getFilesFromDirectory(path, extension);
            } else if (file.isFile() && path.substring(path.lastIndexOf(".")).equals(extension)) {
                list.add(getBytes(file));
            }
        }
    }

    public static String getBytes(File file) {
        String way = file.getAbsolutePath();
        String result = null;
        try (FileInputStream inputStream = new FileInputStream(file)) {
            byte[] bytes = new byte[inputStream.available()];
            result = way + " " + bytes.length;
        } catch (IOException exception) {
            System.out.println("Файл не прочитан :|");
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File file;
        do {
            System.out.println("Введите путь к файлу: ");
            file = new File(scanner.nextLine());
            if (!file.exists()) System.out.println("Файл пупупу");
        } while (!file.exists());
        System.out.println("Введите расширение: ");
        String extension = scanner.nextLine();
        getFilesFromDirectory(file.getAbsolutePath(), extension);
        list.stream().sorted(String::compareTo).forEach(System.out::println);
    }
}

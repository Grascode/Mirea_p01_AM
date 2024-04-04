package homework4;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Plant plant = new Plant();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название растения ");
        String name = scanner.nextLine();
        plant.setName(name);
        System.out.println("Введите цвет растения ");
        String color = scanner.nextLine();
        plant.setColor(color);
        System.out.println("Растение домашнее? (да/нет) ");
        String home = scanner.nextLine();
        plant.setHome(home);
        System.out.println("Растение пахучее? (да/нет) ");
        String stinky = scanner.nextLine();
        plant.setStinky(stinky);
        int age;
        while (true) {
            System.out.println("Введите возраст растения (в годах) ");
            try {
                age = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException exception) {
                System.out.println("Вы ввели не число ");
            }
        }
        plant.setAge(age);
        System.out.println("Введите путь, куда сохранить файл: ");
        String path = scanner.nextLine();
        Saver saver = new Saver(plant, path);
        Thread thread = new Thread(saver);
        thread.start();
    }
}
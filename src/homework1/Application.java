package homework1;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название растения ");
        String name = scanner.nextLine();
        Plant plant = new Plant(name);
        Gardener oleg = new Gardener();
        oleg.filter(plant);
        System.out.println(plant.getName());
        System.out.println("""
            Выполнил работу: Меньщиков Александр
            Группа: РИБО-04-22
            Вариант: 4
            """);
    }
}

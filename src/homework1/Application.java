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
    }
}

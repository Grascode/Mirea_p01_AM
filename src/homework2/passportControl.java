package homework2;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TreeMap;

public class passportControl {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Passport> pass = new ArrayList<>() {{
        add(new Passport("Антонов Андрей Антонович", 445566, "сантехник", false));
        add(new Passport("Иванов Иван Иванович", 112134, " директор", true));
        add(new Passport("Яковлева Юлия Аристарховна", 306306, "секретарь", false));
        add(new Passport("Максимов Максим Максимович", 121512, "продавец", true));
        add(new Passport("Фархадов Фархад Фархадович", 452325, "налогоплатильщик", false));
    }};
    public static void showPass(){
        pass.sort(Passport::compareTo);
        pass.forEach(System.out::println);
        System.out.println();
        pass.sort((o1, o2) -> o1.getNumber() - o2.getNumber());
        pass.forEach(System.out::println);
    }
    private static boolean NumberDetect(int Number) {
        return pass.stream().anyMatch(x -> x.getNumber() == Number);
    }
    public static void addNew(){
        System.out.println("Введите ФИО ");
        String fName = scanner.nextLine();
//        for(Passport item: pass){
//            String name = item.getFullName();
//            if(name.equalsIgnoreCase(fName)){
//                pass.remove(item);
//            }
//            else break;
//        }
        int num = 0;
        while(true){
            System.out.println("Введите номер пропуска ");
            try{
                num = Integer.parseInt(scanner.nextLine());
                if(String.valueOf(num).length() != 6){
                    System.out.println("Вы ввели не корректный номер");
                    continue;
                }
                else break;
            }catch (NumberFormatException exception) {
                System.out.println("Вы ввели не число");
            }
        }
        for(Passport item: pass) {
            String name = item.getFullName();
            int numb = item.getNumber();
            if (numb == num && !(fName.equalsIgnoreCase(name))) {
                pass.remove(item);
                break;
            }
        }
        System.out.println("Введите профессию ");
        String prof = scanner.nextLine();
        System.out.println("Вы прошли допуск на закрытую территорию? (Да/Нет) ");
        String accsMessage;
        boolean accs;
        while(true) {
            accsMessage = scanner.nextLine();
            if (accsMessage.equalsIgnoreCase("да")) {
                accs = true;
                break;
            }
            else if (accsMessage.equalsIgnoreCase("нет")) {
                accs = false;
                break;
            }
            else{
                System.out.println("(Да/Нет)");
                continue;
            }
        }
            pass.add(new Passport(fName, num, prof, accs));
            userInterface();
    }
    public static void showAll(){
        showPass();
        userInterface();
    }
    public static void userInterface(){
        System.out.println("1: Добавить новый пропуск \n" +
                "2: Вывести все пропуска \n" +
                "3: Закончить программу");
        int choose = Integer.parseInt(scanner.nextLine());
        switch(choose){
            case 1: {
                addNew();
                break;
            }
            case 2: {
                showAll();
                break;
            }
            case 3: {
                break;
            }
        }
    }

    public static void main(String[] args) {
        userInterface();
    }
}

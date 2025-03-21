package lesson1;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        welcomeUserByName();
        seyHelloByTime();
        printSuccess();

    }

    public static void welcomeUserByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Здравствуйте, как вас зовут?");
        String name = scanner.nextLine();
        System.out.println("Рад знакомствуте " + name);
    }


    public static void seyHelloByTime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите час (от 0 до 24):");
        int time = scanner.nextInt();

        if (time >= 22 || time < 6) {
            System.out.println("Доброй ночи!");
        } else if (time >= 6 && time < 12) {
            System.out.println("Доброе утро!");
        } else if (time >= 12 && time < 18) {
            System.out.println("Добрый день!");
        } else if (time >= 18 && time < 22) {
            System.out.println("Добрый вечер!");
        } else {
            System.out.println("Некорректное время");
        }


    }

    public static void printSuccess() {
        System.out.println("У вас уже неплохо получается программировать!");
    }
}

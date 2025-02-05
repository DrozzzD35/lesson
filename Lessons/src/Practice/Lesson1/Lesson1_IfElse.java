package Practice.Lesson1;

import java.util.Scanner;

public class Lesson1_IfElse {
    public static void main(String[] args) {
        WelcomeUserByName();
        sayHalloByTime();
    }

    public static void WelcomeUserByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Здравствуйте!");
        System.out.println("Как вас зовут?");
        String name = scanner.nextLine();
        System.out.println("Рад знакомству " + name);
    }

    public static void sayHalloByTime() {
        System.out.println("Сколько сейчас времени?");
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();

        if (time >= 0 && time < 6 || time >= 22 && time < 24) {
            System.out.println("Доброй ночи!");
            System.out.println("У вас уже неплохо получается программировать!");
        } else if (time >= 6 && time < 12) {
            System.out.println("Доброе утро!");
            System.out.println("У вас уже неплохо получается программировать!");
        } else if (time >= 12 && time < 18) {
            System.out.println("Добрый день!");
            System.out.println("У вас уже неплохо получается программировать!");
        } else if (time >= 18 && time < 22) {
            System.out.println("Добрый вечер!");
            System.out.println("У вас уже неплохо получается программировать!");
        } else {
            System.out.println("Неверно указано время.");
        }
    }

    public static void printSuccess() {
        System.out.println("У вас уже неплохо получается программировать!");
    }
}

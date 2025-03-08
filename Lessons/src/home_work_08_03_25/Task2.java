package home_work_08_03_25;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите день недели числом (1-7)");
        int day = scanner.nextInt();
        switch (day) {
            case 1 -> {
                System.out.println("Понедельник");
            }
            case 2 -> {
                System.out.println("Вторник");
            }
            case 3 -> {
                System.out.println("Среда");
            }
            case 4 -> {
                System.out.println("Четверг");
            }
            case 5 -> {
                System.out.println("Пятница");
            }
            case 6 -> {
                System.out.println("Суббота");
            }
            case 7 -> {
                System.out.println("Воскресенье");
            }
            default -> {
                System.out.println("Неверно указан день");
            }
        }
    }
}



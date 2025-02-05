package Practice.youTube;

import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {
        System.out.println("Введите какой сейчас месяц:");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        if (month == 1 || month == 2 || month == 12) {
            System.out.println("Зима");
        } else if (month >= 3 && month <= 5) {
            System.out.println("Весна");
        } else if (month >= 6 && month <= 8) {
            System.out.println("Лето");
        } else if (month >= 9 && month <= 11) {
            System.out.println("Осень");
        } else {
            System.out.println("Неверно указан месяц");
        }
    }
}

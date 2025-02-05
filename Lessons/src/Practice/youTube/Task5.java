package Practice.youTube;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Введите год");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int division = year % 4;

        if (year % 400 == 0 || division == 0 && year % 100 != 0) {
            System.out.println(year + " високосный");
        } else {
            System.out.println(year + " не високосный");
        }
    }
}

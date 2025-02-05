package Practice.youTube;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 10 == 3 || number % 10 == -3) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

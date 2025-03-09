package home_work_08_03_25;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        do {
            int x = i % 10;
            System.out.println("Количество цифр в заданном числе " + x);
        } while (i == 0);
    }
}
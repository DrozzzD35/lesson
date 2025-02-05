package lesson3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива: ");
        Scanner scanner = new Scanner(System.in);

        int array = scanner.nextInt();
        int[] elements = new int[array];

        for (int i = 0; i < array; i++) {
            System.out.println("Введите элемент массива: " + (i + 1));
            elements[i] = scanner.nextInt();
        }
        System.out.println("Введите число которое нужно найти в массиве: ");
        int number = scanner.nextInt();


        boolean result = false;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == number) {
                result = true;
                System.out.println("Число найдено под индексом: " + (i + 1));
            }
        }
        if(!result){
            System.out.println("Число не найдено");
        }
    }
}

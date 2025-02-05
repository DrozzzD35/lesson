package lesson3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива: ");
        Scanner scanner = new Scanner(System.in);

        int array = scanner.nextInt();
        int[] size = new int[array];

        for (int i = 0; i < array; i++) {
            System.out.println("Введите элементы массива: ");
            size[i] = scanner.nextInt();
        }
        System.out.println("Позитивный элемент: " + positiveCount(size));
        System.out.println("Негативный элемент: " + negativeCount(size));

    }

    private static int positiveCount(int[] size) {
        int positiveCount = 0;
        for (int i = 0; i < size.length; i++) {
            if (size[i] >= 0) {
                positiveCount += 1;
            }
        }
        return positiveCount;
    }

    private static int negativeCount(int[] size) {

        int negativeCount = 0;
        for (int i = 0; i < size.length; i++)
            if (size[i] < 0) {
                negativeCount += 1;
            }
        return negativeCount;
    }
}
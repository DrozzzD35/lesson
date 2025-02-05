package lesson3;

import java.util.Arrays;
import java.util.Scanner;


public class Task1 {
    public static void main() {

        System.out.println("Введите размер массива:");
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] elements = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Введите элемент массива: " + (i + 1));
            elements[i] = scanner.nextInt();
        }
        System.out.println("Вывожу элементы массива в обратном порядке: ");

        for (int i = elements.length; i > 0; i--) {
            System.out.print(elements[i - 1] + " ");
        }
    }
}



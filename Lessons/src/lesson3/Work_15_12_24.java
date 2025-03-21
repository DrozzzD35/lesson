package lesson3;

import java.util.Scanner;

public class Work_15_12_24 {

    public static void main(String[] args) {
        int[] numbers = new int[5]; // [0,0,0,0,0]
        numbers[0] = 10; // [10,0,0,0,0]
        numbers[1] = 20; // [10,20,0,0,0]

        String[] names = new String[3];
        names[0] = "аня";

//        console();
        arrayAndFor();
    }

    public static void console() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько чисел вы хотите ввести?");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        /*
         1 итерация:
            [0,0,0,0,0]

            i = 0;
            Ввести число 1:
            numbers[0] = 5
         2 итерация:
            [5,0,0,0,0]

            i = 1;
            Ввести число 2:
            numbers[1] = 4
         3 итерация:
            [5,4,0,0,0]

            i = 2;
            Ввести число 3:
            numbers[2] = 3
         4 итерация:
            [5,4,3,0,0]

            i = 3;
            Ввести число 4:
            numbers[3] = 2
         5 итерация:
            [5,4,3,2,0]

            i = 4;
            Ввести число 5:
            numbers[4] = 1


            [5,4,3,2,1] -> выход из цикла
        *
        * */
        for (int i = 0; i < size; i++) {
            System.out.println("Ввести число " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Вы ввели: ");
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }

    }

    public static void arrayAndFor() {
        int[] array = {1, 2, 3, 4, 5}; // [1,2,3,4,5]
        System.out.println("Длина массива: " + array.length);

        int[] scores = {10, 20, 30};
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Элемент с индексом " + i + ": " + scores[i]);
        }


    }
}

package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class ClassWork {
    public static void main(String[] args) {
        /*  min();
        arr();*/
        UserInput();

    }

    /*
    Упражнение "Найти минимальное значение":
        Создайте массив из пяти целых чисел [10, 3, 45, 2, 15].
        Найдите минимальное значение в массиве с помощью цикла for
    * */
    public static void min() {
        int[] array = {10, 3, 45, 2, 15};
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Минимальное значение: " + min);

    }

    public static void arr() {
        int[] arr = {1, 2, 4, 7, 10};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 2) == 0) {
                sum += arr[i];
                System.out.println("Четные элементы массива: " + arr[i]);
            }
            System.out.println("Сумма четных элементов массива: " + sum);
        }

    }

    public static void UserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");

        int arraySize = scanner.nextInt();
        int[] expenses = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.println("Введите элемент массива " + (i + 1) + ": ");
            expenses[i] = scanner.nextInt();

        }

        int sum = 0;
        for (int i = 0; i < expenses.length; i++) {
            sum += expenses[i];
        }

        System.out.println("Элементы массива: " + Arrays.toString(expenses));
        System.out.println("Сумма элементов массива: " + sum);


    }
}

    /* TODO
     Упражнение "Сумма чётных чисел":
        Создайте массив из int[] arr = {1, 2, 4, 7, 10}.
        Найдите сумму только чётных элементов.
    * */


    /* TODO
    Упражнение "Пользовательский ввод":
        Попросите пользователя ввести размер массива.
        Затем пусть он введёт все элементы.
        После этого выведите все элементы массива и найдите их сумму.
    * */
  /*      public static void array () {
            Scanner scanner = new Scanner(System.in);

*/




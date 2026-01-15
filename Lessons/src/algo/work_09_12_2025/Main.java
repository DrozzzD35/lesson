package algo.work_09_12_2025;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,7,9};
        solution(arr, 11);

        /*

        1) индексация с нуля
        2) фиксированный размер
        3) быстрый доступ (О(1))
        4) Медленная вставка\удаления - нужно сдвигать элементы О(n)

         */
        /*


        O(1) - константа\ пример доступ по индексу\ 1 операция

        O(log(n)) - логарифмическая\ бинарный поиск\ 10 операций (для n = 1000)

        O(n) - линейная\ проход по массиву\ 1000 операций (для n = 1000)

        O(n * log(n)) - линейно-логарифмическая\ сортировки\ 10000 операций (для n = 1000)

        O(n^2) - квадратичная\ вложенный цикл\ 1000000 операций (для n = 1000)

        O(2^n) - экспонента\ полный перебор\ смерть

         */


        /*
        Паттерн два указателя:
         1) указатели движутся навстречу друг другу
        [1, 5, 8, 6, 4]
         у1          у2

         2) указатели в одном направлении
             [1, 5, 8, 6, 4]
             у1          у2
             медленным    быстрый
             - удаляем дубликаты
             - ищем массив
             - ищем цикличность в массиве
         */


        //Развернуть массив на месте, без создания нового массива
        /*
        [1, 5, 8, 6, 4]

        1)
        int i = arr[0];
        int i = arr[0];

        2)

//         */
//        reverseArr();
//
//        System.out.println(checkPolindrom());


    }

    public static void reverseArr() {

        int[] arr = {1, 5, 8, 6, 4};

        System.out.println("До: " + Arrays.toString(arr));
        // создаем указатели
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left]; //1
            arr[left] = arr[right];
            arr[right] = temp;

            //увеличить указатели
            left++;
            right--;
        }

        System.out.println("После: " + Arrays.toString(arr));


    }

    static boolean checkPolindrom() {
//        int[] arr = {1, 2, 3, 2, 1};
//        int[] arr = {1, 2, 3, 5, 1};
        int[] arr = {1, 2, 3, 5, 3, 2, 1};

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }


    //{1, 5, 8, 6, 4};
    static void solution(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;
        int sum;

        while (left < right) {
            sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println("Сумма чисел " + arr[left] + " " + arr[right] + " равна таргету");
                return;
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }

        }
        System.out.println("Число не найдено");


    }
}

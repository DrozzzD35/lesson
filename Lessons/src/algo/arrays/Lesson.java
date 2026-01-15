package algo.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        patternTwoPoints(arr);

        int[] arr1 = {2, 1, 5, 1, 3, 2};
        System.out.println(solution(arr1, 3));


        pattern3(arr1, 1, 4);
        temperatures(arr1, 3);

    }

    private static void pattern3(int[] arr1, int l, int r) {
    /*
    Prefix Sum (Префиксные суммы)
    Множественные запросы суммы на отрезке [i, j]
    Подсчёт количества элементов, удовлетворяющих условию
    Задачи с накопительными значениями
    Поиск подмассива с заданной суммой

    Формула: sum(left, right) = prefix[right + 1] - prefix[left]

    Исходный массив:  [3, 1, 4, 2, 5]
                       0  1  2  3  4  (индексы)

    Prefix Sum:       [0, 3, 4, 8, 10, 15]
                       0  1  2  3   4   5  (индексы)

    prefix[0] = 0 (пустая сумма)
    prefix[1] = 3 (сумма [0..0])
    prefix[2] = 3 + 1 = 4 (сумма [0..1])
    prefix[3] = 3 + 1 + 4 = 8 (сумма [0..2])
    prefix[4] = 3 + 1 + 4 + 2 = 10 (сумма [0..3])
    prefix[5] = 3 + 1 + 4 + 2 + 5 = 15 (сумма [0..4])

    Запрос: сумма элементов с индекса 1 по 3 включительно
    = prefix[4] - prefix[1] = 10 - 3 = 7

    Почему работает:
    prefix[right + 1] = arr[0] + arr[1] + ... + arr[right]
    prefix[left]      = arr[0] + arr[1] + ... + arr[left - 1]

    Разность = arr[left] + arr[left + 1] + ... + arr[right]
             = сумма на отрезке [left, right]
     */

        int[] prefix = new int[arr1.length + 1];

        /*
        arr = [1,2,3,4]
        p = [0, 0, 0, 0, 0]

        1)  p[0+1] =prefix[0] + arr1[0] = 0 + 1 = 1; -> [0, 1, 0, 0, 0]
        2)  p[1+1] =prefix[1] + arr1[1] = 1 + 2 = 3; -> [0, 1, 3, 0, 0]
        3)  p[2+1] =prefix[2] + arr1[2] = 3 + 3 = 6; -> [0, 1, 3, 6, 0]
        4)  p[3+1] =prefix[3] + arr1[3] = 6 + 4 = 10; -> [0, 1, 3, 6, 10]
         */
        for (int i = 0; i < arr1.length; i++) {
            prefix[i + 1] = prefix[i] + arr1[i];
        }

        System.out.println(prefix[r + 1] - prefix[l]);
    }

    public static int solution(int[] arr, int k) {

               /*
        Sliding Window
        Максимальная/минимальная сумма k элементов подряд
        Средняя температура за последние n дней
        Поиск подстроки с определёнными свойствами
        Подсчёт уникальных элементов в окне
        Поиск анаграмм
         */

        /*
        Задача: Найти максимальную сумму любых k подряд идущих элементов.

        Массив: [2, 1, 5, 1, 3, 2], k = 3

        Окно 1: [2, 1, 5] - сумма = 8
         -------

        Окно 2: [1, 5, 1] - сумма = 8 - 2 + 1 = 7
                    -------
                 убрали 2, добавили 1

        Окно 3: [5, 1, 3] - сумма = 7 - 1 + 3 = 9  ← МАКСИМУМ!
                       -------
                 убрали 1, добавили 3

        Окно 4: [1, 3, 2] - сумма = 9 - 5 + 2 = 6
                          -------
                 убрали 5, добавили 2

        Максимум = 9 (подмассив [5, 1, 3])


         * Алгоритм:
         * 1. Считаем сумму первого окна (первых k элементов)
         * 2. Скользим окно: убираем левый элемент, добавляем правый
         * 3. Обновляем максимум на каждом шаге
         */

        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int max = sum;

        for (int i = k; i < arr.length; i++) {

            sum = sum + arr[i] - arr[i - k];
            if (max < sum) {
                max = sum;
            }

        }
        return max;


    }

    public static void patternTwoPoints(int[] arr) {
               /*
        Два указателя.
        Когда используем:
        - Поиск пары элементов с определённой суммой (в отсортированном массиве)
        - Разворот массива или строки
        - Удаление дубликатов из отсортированного массива
        - Проверка палиндрома
        - Разделение массива на части (partition)
        - Слияние двух отсортированных массивов
         */


        /*
        Разворот массива: [1, 2, 3, 4, 5]

        Шаг 1: left=0, right=4
        [1, 2, 3, 4, 5]
         ↑           ↑
         L           R
        Меняем местами 1 и 5: [5, 2, 3, 4, 1]

        Шаг 2: left=1, right=3
        [5, 2, 3, 4, 1]
            ↑     ↑
            L     R
        Меняем местами 2 и 4: [5, 4, 3, 2, 1]

        Шаг 3: left=2, right=2
        [5, 4, 3, 2, 1]
               ↑
              L=R

         */


        int temp;
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.println(Arrays.toString(arr));

    }

    // Дан массив температур за n дней. Найти среднюю температуру для каждого окна из k дней.
    //    Массив: [2, 1, 5, 1, 3, 2], k = 3
    public static void temperatures(int[] temps, int k) {
        /*
                 [1, 2, 3, 4, 5] , k = 2
                result.length = ?.
                 k = 1, 5 окон, [5 - k + 1]
                 k = 2, 4 окон, [5 - k + 1]
                 k = 3, 3 окон, [5 - k + 1]
                 k = 4, 2 окон, [5 - k + 1]
                 k = 5, 1 окон, [5 - k + 1]
             1) [1, 2]; sum = 3, av = 3\2, result = [3\2,.....]
             1) [2, 3]; sum = 5, av = 5\2, result = [3\2,5\2.....]
             1) [3, 4]; sum = 7, av = 7\2, result = [3\2, 5\2, 7\2....]
             1) [4, 5]; sum = 9, av = 9\2, result = [3\2, 5\2, 7\2, 9\2]
              [3\2, 5\2, 7\2, 9\2]
              {1.5, 2.5, 3.5, 4.5}
         */

        double sum = 0;
        int j = 0;
        double[] result = new double[temps.length - k + 1];

        for (int i = 0; i < k; i++) {
            sum += temps[i];
        }
        double average = sum / k;
        result[j] = average;
        j++;

        for (int i = k; i < temps.length; i++, j++) {
            sum = sum + temps[i] - temps[i - k];
            average = sum / k;
            result[j] = average;
        }
        System.out.println(Arrays.toString(result));

    }

}

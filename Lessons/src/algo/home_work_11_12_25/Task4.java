package algo.home_work_11_12_25;

import java.util.Arrays;

public class Task4 {

    /*
     * Задача: Переместить все нули в конец массива, сохранив порядок остальных.
     *
     * Ещё одна классика LeetCode!
     *
     * Пример: [0, 1, 0, 3, 12] → [1, 3, 12, 0, 0]
     *
     * Идея: Два указателя в одном направлении.
     * - slow — место для следующего ненулевого элемента
     * - fast — ищет ненулевые элементы
     */

    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 3, 0};

        solution(arr);
    }

    static void solution(int[] arr) {
        int left = 0;
        int right = 0;

        while (right < arr.length) {
            if (arr[right] != 0) {
                arr[left] = arr[right];
                arr[right] = 0;
                left++;
            }
            right++;

        }

        System.out.println(Arrays.toString(arr));

    }
}

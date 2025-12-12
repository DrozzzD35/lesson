package home_work_11_12_25;

import java.util.ArrayList;
import java.util.List;

public class Task3 {

    /*
     * Задача: Найти НАИМЕНЬШУЮ длину подмассива, сумма которого >= S.
     *
     * Это пример ДИНАМИЧЕСКОГО скользящего окна!
     * Размер окна не фиксированный, а меняется.
     *
     * Пример: arr = [2, 1, 5, 2, 3, 2], S = 7
     * Ответ: 2 (подмассив [5, 2] или [2, 5])
     *
     * Алгоритм:
     * 1. Расширяем окно вправо, пока сумма < S
     * 2. Когда сумма >= S — пытаемся сжать окно слева
     * 3. Запоминаем минимальную длину
     */


    public static void main(String[] args) {

    }

    static void solution(int[] arr, int s) {
        int sum = 0;

        for (int i = 0; sum < s; i++) {
            sum += arr[i];

        }

        for (int i = 0; i < arr.length; i++) {
            if (sum == s){

                return;
            }


        }


    }
}

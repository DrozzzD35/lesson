package home_work_11_12_25;

import java.util.HashSet;

public class Task1 {


    /*
     * Задача: Найти первый элемент, который повторяется.
     *
     * Пример: [2, 5, 1, 2, 3, 5, 1, 2]
     * Ответ: 2 (первый, который встретился дважды)
     *
     * Идея: Используем HashSet (это как HashMap, но без значений).
     * Если элемент уже есть в Set — это дубликат!
     */
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 2, 3, 5, 1, 2};

        System.out.println(solution(arr));
    }

    static int solution(int[] arr) {
        HashSet<Integer> map = new HashSet<>();

        for (int j : arr) {
            if (map.contains(j)) {
                return j;
            } else {
                map.add(j);
            }

        }
        return 0;

    }
}

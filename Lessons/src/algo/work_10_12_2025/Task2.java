package algo.work_10_12_2025;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
//        Задача: Подсчитать, сколько раз встречается каждый элемент

        int[] arr = {2, 4, 7, 8, 9, 7, 8, 5, 7, 5};

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }

        }
        System.out.println(map);


    }


}

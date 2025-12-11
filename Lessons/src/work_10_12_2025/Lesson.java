package work_10_12_2025;

import java.util.HashMap;
import java.util.Map;

public class Lesson {


    public static void main(String[] args) {
//        slidingWindow();

        int[] arr = {1, 2, 5, 4, 1, 6, 7, 2};
        int target = 10;

        //O(n^2) - плохо!
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] + arr[j] == target) {
//                    System.out.println("i:" + arr[i] + " j:" + arr[j]);
//                }
//            }
//        }

        //map = ( 1,0 )( 2,1 )( 5,2 )( 4,3 )( 1, 4)( 6,5 )( 7,6 )( 2, 7)
        //comp = 9 8 5 6 9 4 3 8
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int comp = target - arr[i];
            if (map.containsKey(comp)) {
                System.out.println("comp:" + comp + " i:" + arr[i]);
            }
            map.put(arr[i], i);
        }

    }

    private static void slidingWindow() {
        // [1, 2, 5, 4, 1, 6, 7, 2]

        /*
        окно равно 3
        1) [1, 2, 5,] 4, 1, 6, 7, 2  \\\\8
        2) 1, [2, 5, 4] 1, 6, 7, 2   \\\\ 11
        3) 1, 2, [5, 4, 1] 6, 7, 2   \\\10


         */
        // n*n -> n*k -> n * log(n) -> n > log(n)
//        for(int i = 0; i<= n-k; i++){
//            int sum = 0;
//            for (int j = i; j < i+k; j++){
//                sum += arr[j];
//            }
//        }

        int[] arr = {1, 2, 5, 4, 1, 6, 7, 2};
        int k = 3;
        int sum = 0;


        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i - k] + arr[i];
        }

        /*
         [1, 2, 5,] 4, 1, 6  || 8
        1) 4, 1, 6, 7, 2

        sum = 8 - 1 + 4 = 11


        2) 1, [2, 5, 4] 1, 6   \\\\ 11
        sum = 11 - 2 + 1 = 10


        3) 1, 2, [5, 4, 1] 6 \\\10

        sum = 10 - 5 + 6 = 11

         */
    }
}

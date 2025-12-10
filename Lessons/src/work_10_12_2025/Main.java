package work_10_12_2025;

public class Main {


    public static void main(String[] args) {
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
        int k =3;
        int sum = 0;


        for(int i = 0; i<k;i++){
            sum+=arr[i];
        }

        for(int i = k; i<arr.length;i++){
            sum = sum - arr[i-k] +arr[i];
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

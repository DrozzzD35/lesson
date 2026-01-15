package algo.work_10_12_2025;

public class Task1 {

    public static void main(String[] args) {
        //Задача: Найти максимальную сумму подмассива длины k.

        int[] arr = {5, 8, 4, 3};
        int k = 2;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int max = sum;

        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i - k] + arr[i];

            if (sum > max) {
                max = sum;
            }
        }

        System.out.println(max);


    }
}

package leetCode.Task_04_11_2025.Task1;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arr = {1, 2, 3};
        int[] arr1 = {4, 3, 2, 1};
        int[] arr2 = {9};

        System.out.println(Arrays.toString(solution.plusOne(arr)));
        System.out.println(Arrays.toString(solution.plusOne(arr1)));
        System.out.println(Arrays.toString(solution.plusOne(arr2)));


    }
}
package leetCode.Task_10_11_2025.Task1;

public class Solution {

    public int climbStairs(int n) {

        int[] numbers = new int[n];
        if (n == 1) {
            return n;
        } else if (n == 2) {
            return n;
        } else {
            numbers[0] = 1;
            numbers[1] = 2;
        }

        for (int i = 2; i < numbers.length; i++) {

            numbers[i] = numbers[i - 1] + numbers[i - 2];

        }

        return numbers[n - 1];

    }
}

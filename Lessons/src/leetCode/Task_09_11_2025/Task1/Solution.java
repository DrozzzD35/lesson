package leetCode.Task_09_11_2025.Task1;

public class Solution {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int mid;

        while (left <= right) {
            mid = (left + right) / 2;
            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            } else if (square < x) {
                left = mid + 1;
            } else if (square > x) {
                right = mid - 1;
            }
        }

        return right;


    }

}

package leetCode.Task_16_10_2025.Task1;

public class Solution {
    public boolean isPalindrome(int x) {
        int y = 0;
        int number = x;

        while (number > 0) {
            y = (number % 10) + (y * 10);
            number /= 10;

        }

        return x == y;
    }

}

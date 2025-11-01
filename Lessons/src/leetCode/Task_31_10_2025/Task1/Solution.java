package leetCode.Task_31_10_2025.Task1;

import java.util.Arrays;

public class Solution {

    public int[] getSneakyNumbers(int[] nums) {

        Arrays.sort(nums);
        int[] doubleNumbers = new int[2];
        int index = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                doubleNumbers[index] = nums[i];
                index++;
            }

        }

        return doubleNumbers;






    }
}

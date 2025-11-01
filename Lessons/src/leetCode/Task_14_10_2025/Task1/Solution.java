package leetCode.Task_14_10_2025.Task1;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int a = 0;

        if (nums.length < 1) {
            return a;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[a] = nums[i];
                a++;
            }

        }
        return a;

    }

}

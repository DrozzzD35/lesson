package leetCode.Task_11_10_2025.Task1;

import java.util.Arrays;

public class Solution {

    public int removeDuplicates(int[] nums) {
//        int k = 1;
//        if (nums.length < 1) {
//            return k;
//        }
//        int a = nums[0];
//
//        for (int i = 1; i < nums.length; i++) {
//
//            if (nums[i] != a) {
//                a = nums[i];
//                if (nums[i] != Integer.MAX_VALUE) {
//                    k++;
//                }
//            } else {
//                nums[i] = Integer.MAX_VALUE;
//            }
//
//        }
//        Arrays.sort(nums);

        int j = 0;

        if (nums.length < 1) {
            return j + 1;
        }

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }


        }
        return j + 1;

    }

}

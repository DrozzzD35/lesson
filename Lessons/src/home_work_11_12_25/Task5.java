package home_work_11_12_25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {

    public static void main(String[] args) {

    }

    static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> lists = new ArrayList<>();
        int right;
        int left;
        int n = nums.length;
        int sum;

        for (int i = 0; i < n; i++) {
            left = i + 1;
            right = n - 1;

            while (left < right) {
                sum = nums[left] + nums[right] + nums[i];
                if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    lists.add(List.of(nums[left], nums[right], nums[i]));
                    left++;
                    right--;
                }
            }
        }

        return lists;
    }
}

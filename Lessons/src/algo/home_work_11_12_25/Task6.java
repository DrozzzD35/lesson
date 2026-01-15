package algo.arrays.home_work_11_12_25;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task6 {
    public static void main(String[] args) {
        int[] nums = {};

        sortColors(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static void sortColors2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int j = 0;
        int index = 0;

        if (nums.length == 1) {
            return;
        }

        while (j < nums.length) {
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            j++;
        }

        for (int collor = 0; collor <= 2; collor++) {
            int value = map.getOrDefault(collor, 0);

            while (value > 0) {
                nums[index] = collor;
                index++;
                value--;
            }
        }


    }

    public static void sortColors(int[] nums) {
        int[] counts = new int[3];
        int index = 0;
        int value;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                counts[0] += 1;
            } else if (nums[i] == 1) {
                counts[1] += 1;
            } else {
                counts[2] += 1;
            }
        }

        for (int i = 0; i < counts.length; i++) {
            value = counts[i];

            while (value > 0) {
                nums[index] = i;
                value--;
                index++;
            }
        }


    }


}

package work_06_10_2025;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(withMap(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target) {


        for (int i = 0; i < nums.length; i++) {
            int index1=i;
            int index2 = 0;
            int value1 = target - nums[i];

            for (int j = i+1; j < nums.length; j++) {
                if ( nums[j] == value1){
                    index2 = j;
                    return new int[]{index1,index2};
                }

            }

        }

        return new int[]{};

    }

    public static int[] withMap(int[] nums, int target){

        Map<Integer, Integer> sumMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int a = target - nums[i];

            if (sumMap.containsKey(a)) {
                return new int[]{sumMap.get(a), i};
            }
            sumMap.put(nums[i],i);


        }
        return new int[]{};




    }

}




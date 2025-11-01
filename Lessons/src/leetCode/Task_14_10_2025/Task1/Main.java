package leetCode.Task_14_10_2025.Task1;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};

        System.out.println(solution.removeElement(nums, 2));

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Индекс " + i + " равен - " + nums[i]);

        }


    }
}

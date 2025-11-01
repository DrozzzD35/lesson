package leetCode.Task_01_11_2025.Task1;


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 3, 5, 6};
        int[] nums1 = {1, 3, 5, 6};
        int[] nums2 = {1, 3, 5, 6};

        System.out.println(solution.searchInsert(nums, 5));
        System.out.println(solution.searchInsert(nums1, 2));
        System.out.println(solution.searchInsert(nums2, 7));

    }
}
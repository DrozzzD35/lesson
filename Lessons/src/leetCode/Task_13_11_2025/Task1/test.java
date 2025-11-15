package leetCode.Task_13_11_2025.Task1;

public class test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        int[] nums3 = {1};
        int[] nums4 = {};

        int[] nums5 = {0};
        int[] nums6 = {1};

        printArr(nums1);
        solution.merge(nums1, 3, nums2, 3);
        printArr(nums1);
        solution.merge(nums3, 1, nums4, 0);
        solution.merge(nums5, 0, nums6, 1);

        printArr(nums3);
        printArr(nums5);


    }

    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }
}

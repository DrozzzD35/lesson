package leetCode.Task_13_11_2025.Task1;

public class test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};


        printArr(nums1);
        printArr(nums2);

        solution.merge(nums1, 3, nums2, 3);


        printArr(nums1);
        printArr(nums2);

        printArr(solution.getArr());


    }

    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }
}

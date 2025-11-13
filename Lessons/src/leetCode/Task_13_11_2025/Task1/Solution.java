package leetCode.Task_13_11_2025.Task1;

public class Solution {
    private int[] arr;

    public int[] getArr() {
        return arr;
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        arr = new int[nums1.length];

        for (int i = 0, j = 0; i < nums1.length; ) {

            if (nums1[i] >= nums2[j]) {
                arr[i] = nums2[j];
                j++;

            } else if (nums1[i] < nums2[j]) {
                arr[i] = nums1[i];
                i++;
            }


        }


    }


}

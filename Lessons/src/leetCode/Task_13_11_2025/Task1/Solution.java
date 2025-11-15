package leetCode.Task_13_11_2025.Task1;

public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if (nums1 == null) {
            return;
        }
        int i = nums1.length - 1;
        m -= 1;
        n -= 1;

        while (n >= 0) {
            if (m >= 0 && nums1[m] >= nums2[n]) {
                nums1[i] = nums1[m];
                m--;
            } else {
                nums1[i] = nums2[n];
                n--;
            }
            i--;

        }


    }


}

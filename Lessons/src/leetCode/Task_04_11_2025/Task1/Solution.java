package leetCode.Task_04_11_2025.Task1;

import java.util.Arrays;

public class Solution {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            if (i == 0 && digits[i] == 9) {
                int[] newDigits = new int[digits.length + 1];
                newDigits[0] = 1;
                return newDigits;

            }

            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }


        }
        return digits;


    }


}

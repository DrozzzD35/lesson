package leetCode.Task_04_11_2025.Task2;

import java.math.BigInteger;

public class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();

        while (carry != 0 || i >= 0 || j >= 0) {
            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            sb.append(sum % 2);
            carry = sum / 2;


//        int i = a.length() - 1;
//        int j = b.length() - 1;
//        int carry = 0;
//        StringBuilder sb = new StringBuilder();
//
//
//        while (carry != 0 || i >= 0 || j >= 0) {
//            int sum = carry;
//
//            if (i >= 0) {
//                sum += a.charAt(i) - '0';
//                i--;
//            }
//
//            if (j >= 0) {
//                sum += a.charAt(j) - '0';
//                j--;
//            }
//
//            sb.append(sum % 2);
//            carry = sum / 2;
//
//
//        }


        }
        sb.reverse();
        return sb.toString();
    }
}

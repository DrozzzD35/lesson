package leetCode.Task_01_11_2025.Task2;

public class Solution {
    public int lengthOfLastWord(String s) {
        String string = s.trim();
        int a = 0;
        int j = string.length();

        for (int i = string.length() - 1; i >= 0; i--) {

            if (string.charAt(i) == ' ') {
                a = i + 1;
                break;

            } else {
                a = i;
            }

        }

        return j - a;

    }

}

package leetCode.Task_17_10_2025.Task2;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        sb.append(strs[0]);


        for (int i = 0; i < strs.length - 1; i++) {

            for (int j = 0; j < sb.length() && j < strs[i+1].length(); j++) {
                    if (sb.charAt(j) != strs[i + 1].charAt(j)) {
                        sb.delete(j, sb.length());
                        break;
                    }
            }
            if (sb.length()>strs[i+1].length()){
                sb.delete(strs[i+1].length(),sb.length());
            }


        }


        return sb.toString();

    }

}

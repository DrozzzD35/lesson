package leetCode.Task_31_10_2025.Task2;


public class Solution {
    public int strStr(String haystack, String needle) {
        StringBuilder sb = new StringBuilder();
        int result;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            if (haystack.charAt(i) == needle.charAt(0)) {
                result = i;
                sb.setLength(0);

                for (int j = 0; j < needle.length(); j++) {
                    if (haystack.charAt(i + j) == needle.charAt(j)) {
                        sb.append(needle.charAt(j));
                    } else {
                        break;
                    }
                }

                if (needle.contentEquals(sb)) {
                    return result;
                }
            }


        }
        return -1;


//                for (int i = 0, j = needle.length(); j <= haystack.length(); i++, j++) {
//                    // берём подстроку haystack от i до j
//                    if (haystack.substring(i, j).equals(needle)) {
//                        return i; // нашли совпадение, возвращаем индекс
//                    }
//                }
//                return -1; // не нашли



    }


}

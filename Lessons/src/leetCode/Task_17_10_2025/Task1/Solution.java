package leetCode.Task_17_10_2025.Task1;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> alphabet = new HashMap<>();
        alphabet.put('I', 1);
        alphabet.put('V', 5);
        alphabet.put('X', 10);
        alphabet.put('L', 50);
        alphabet.put('C', 100);
        alphabet.put('D', 500);
        alphabet.put('M', 1000);

        int number = 0;
        for (int current = 0, next = 1; next < s.length(); current++, next++) {

            if (alphabet.get(s.charAt(current)) >= alphabet.get(s.charAt(next))) {
                number += alphabet.get(s.charAt(current));
            } else {
                number -= alphabet.get(s.charAt(current));
            }

        }

        number += alphabet.get(s.charAt(s.length() - 1));


        return number;

    }

}

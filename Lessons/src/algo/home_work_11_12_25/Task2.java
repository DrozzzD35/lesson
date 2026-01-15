package algo.home_work_11_12_25;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    /*
     * Задача: Проверить, являются ли две строки анаграммами.
     * Анаграмма — слова из одних и тех же букв.
     *
     * Пример: "listen" и "silent" — анаграммы
     *         "hello" и "world" — не анаграммы
     *
     * Идея: Считаем частоту букв в обеих строках с помощью HashMap.
     * Если частоты совпадают — анаграммы!
     */

    public static void main(String[] args) {
        String one = "abc";
        String two = "abd";
        String three = "listen";
        String four = "silent";
        String five = "hello";
        String six = "world";

        System.out.println(solution(one, two));
        System.out.println(solution(three, four));
        System.out.println(solution(five, six));
        System.out.println();

        System.out.println(solutionTwo(one, two));
        System.out.println(solutionTwo(three, four));
        System.out.println(solutionTwo(five, six));
    }

    static boolean solution(String first, String second) {
        Map<Character, Integer> map = new HashMap<>();

        if (first.length() != second.length()) {
            return false;
        }

        for (int i = 0; i < first.length(); i++) {
            char symbol = first.charAt(i);

            map.put(symbol, map.getOrDefault(symbol, 0) + 1);

//            if (map.containsKey(symbol)) {
//                map.put(symbol, map.get(symbol) + 1);
//            } else {
//                map.put(first.charAt(i), 1);
//            }
        }

        for (int i = 0; i < second.length(); i++) {
            char symbol = second.charAt(i);
            int count = map.getOrDefault(symbol, 0);

            if (count == 0) {
                return false;
            }

            map.put(symbol, count - 1);

//            if (map.containsKey(symbol)) {
//                if (map.get(symbol) == 0) {
//                    return false;
//                }
//                map.put(symbol, map.get(symbol) - 1);
//            } else {
//                return false;
//            }
        }

        return true;

    }

    static boolean solutionTwo(String first, String second) {
        Map<Character, Integer> map = new HashMap<>();

        if (first.length() != second.length()) {
            return false;
        }

        for (int i = 0; i < first.length(); i++) {
            char symbolFirst = first.charAt(i);
            char symbolSecond = second.charAt(i);

            map.put(symbolFirst, map.getOrDefault(symbolFirst, 0) + 1);
            map.put(symbolSecond, map.getOrDefault(symbolSecond, 0) - 1);
        }

        for (Integer value : map.values()) {
            if (value != 0) {
                return false;
            }

        }
        return true;

    }
}

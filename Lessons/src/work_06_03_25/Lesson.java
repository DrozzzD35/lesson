package work_06_03_25;

import java.util.ArrayList;
import java.util.List;

public class Lesson {

    public static void main(String[] args) {
        task1();
        task2();

    }


    public static void task1() {
        int[] numbers = {2, 4, 6, 8, 10};
        int result = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 4 == 0) {
                result += numbers[i];
            }
        }
        System.out.println(result);
    }


    public static void task2() {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i).length() < 6) {
                fruits.remove(i);
            }
        }

        System.out.println(fruits);
    }

}

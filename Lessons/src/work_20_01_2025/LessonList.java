package work_20_01_2025;

import java.util.ArrayList;
import java.util.List;

public class LessonList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(); // []

        numbers.add(5);
        numbers.add(50);
        numbers.add(10);


        Integer second = numbers.get(1);


//        for (int i = 0; i <numbers.size(); i++) {
//            System.out.println(numbers.get(i));
//        }

        for (Integer number : numbers) {
            System.out.println(number);
        }

        numbers.remove(1);
        System.out.println("после удаления: " + numbers);
    }
}

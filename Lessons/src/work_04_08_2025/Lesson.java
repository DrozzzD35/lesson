package work_04_08_2025;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lesson {
    public static void main(String[] args) {
        // Быстрый доступ по индексу
        List<String> names = new ArrayList<>();
        names.add("Пётр");
        names.add("Евгений");
        names.add("Алексей");

        // O(1) - константное время (ассиентетическая сложность алгоритма)
        String element1 = names.get(1);

        // O(1)
        names.add("Новое имя");

        names.forEach(name -> System.out.println("Имя " + name.toUpperCase()));

        List<String> uppercaseNames = names.stream()
                .map(name -> name.toUpperCase())
                .filter(name -> name.length() > 5)
                .toList();
        System.out.println(uppercaseNames);

        linkedList();


    }

    public static void linkedList() {
        //Быстрое добавление и удаление в начало и конец за О(1)
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.addFirst(5);
        numbers.addLast(8);
        numbers.removeLast();

        numbers.push(15);
        System.out.println(numbers.pop());
        System.out.println(numbers.peek());

    }

}

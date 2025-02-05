package work_25_01_2025;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lesson {

    public static void main(String[] args) {

        Map<String, Integer> personsMap = new HashMap<>();


        personsMap.put("Anna", 25);
        personsMap.put("Vasay", 15);
        personsMap.put("Peter", 18);

        Integer annaAge = personsMap.get("Anna");
        System.out.println("анне сколько лет? " + annaAge);

        boolean hasAnna = personsMap.containsKey("Anna");
        boolean hasRoma = personsMap.containsKey("Roma");

        System.out.println("Есть ли Анна? " + hasAnna);
        System.out.println("Есть ли Рома? " + hasRoma);

        personsMap.remove("Vasay");

        // Добавление\удаление
        personsMap.put("Peter", 100);
        personsMap.put("NewPeter", 100);

        // только обновление существующего
        personsMap.replace("NewAnna", 30);

//        List<String> names = new ArrayList<>();
//        for(String name : names){
//
//        }

        for (Map.Entry<String, Integer> entry : personsMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        task();
        task2();


    }


    /**
     * Создать HashMap<String, Integer> с начальными значениями (3–5 пар).
     * Удалить один из ключей.
     * Обновить значение для любого ключа.
     * Вывести итоговый набор ключей и значений.
     */
    private static void task() {
        Map<String, Integer> key = new HashMap<>();
        key.put("Раз", 3);
        key.put("Два", 4);
        key.put("Три", 5);

        key.remove("Два");

        key.replace("Раз", 31);

        for (Map.Entry<String, Integer> entry : key.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() + " Значение: " + entry.getValue());
        }
    }


    /**
     * Cделать простейший классический телефонный справочник с использованием HashMap<String, List<String>>,
     * где ключ — это фамилия, а значение — список номеров телефонов.
     */
    private static void task2() {
        List<Integer> lockNumber = new ArrayList<>();
        lockNumber.add(1);
        lockNumber.add(2);
        lockNumber.add(3);

        List<Integer> kentNumber = new ArrayList<>();
        kentNumber.add(4);
        kentNumber.add(5);
        kentNumber.add(6);

        List<Integer> ivanovNumber = new ArrayList<>();
        ivanovNumber.add(7);
        ivanovNumber.add(8);
        ivanovNumber.add(9);

        Map<String, List<Integer>> phoneDirectory = new HashMap<>();
        phoneDirectory.put("Lock", kentNumber);
        phoneDirectory.put("Kent", kentNumber);
        phoneDirectory.put("Иванов", ivanovNumber);

        for (Map.Entry<String, List<Integer>> entry : phoneDirectory.entrySet()) {
            System.out.println("Фамилия: " + entry.getKey() + " Номер: " + entry.getValue());
        }

    }
}

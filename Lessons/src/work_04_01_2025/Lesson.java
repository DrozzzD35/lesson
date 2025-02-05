package work_04_01_2025;

import java.util.ArrayList;
import java.util.List;

public class Lesson {

    public static void main(String[] args) {
        // Основные арифметические операции: +, -, *, /, %

        // Приведение типов
        // Неявное
        int i = 5;
        double d = 4.5;
        double result = i + d;

        // Явное
        long value = Long.MAX_VALUE;
        int result2 = (int) value;

        int resulFromString  = Integer.parseInt("3");

        /*
        Общий приоритет:
        1) Постфиксные операторы: i++, i--
        2) унарные операции: --i, ++i
        3) операция в скобках
        4) умножение, деление, остаток
        5) сложение, вычитание
        6) операторы сравнения (<, >, <=, >=)
        7) Проверка равенства: (==, !=)
        8) логическое И (&&)
        9) Логическое ИЛИ (||)
        10) оператор присваивания (=)

        * */
        System.out.println("пост " + i++);

        System.out.println("унар " + ++i);

        // Утверждения
        boolean isTrue = true;
        boolean isFalse = !isTrue;

        // логические
        // И (&&) истина, если все истина, иначе ложь
        /*
        true && true = true;
        false && true = false
        false && false = false
         */
        int age = 18;
        boolean hasPassport = true;
        boolean canTravel = age >= 18 && hasPassport;

        // Или (||), истина, если хотя бы  одно истина иначе ложь
        /*
        true || true = true;
        false || true = true
        false || false = false
         */

        boolean val = true || false && !false;
        // val  = true
        // ( 10 + 5 ) * 3 / 2 % 4
        // 22 % 4 (4*5 = 20 -> 5 целое),22 - 20 = 2

    }

    private void array() {
        /*
            Массив (Array):
                1) Фиксированная длина
                2) Быстрый доступ к элементам (O(1))
                3) Сложно добавляем и удаляем (двигать массив и менять размер)
            Список (List):
                1) Динамический размер
                2) Удобно удалять и добавлять элементы
                3) Доступ по индексу (O(1))

         */


        int[] numbersOfArr = new int[3]; // [0,0,0]
        numbersOfArr[0] = 1;
        numbersOfArr[1] = 22;

        List<Integer> numbersOfList = new ArrayList<>(); // []
        numbersOfList.add(1);
        numbersOfList.add(22);
        numbersOfList.add(1, 10);

        /*
        Методы списка:
        add(E e) - добавление
        add(int index ,E e) - добавление\изменяет элемент по индексу
        get(int index);
        contains(Object o)
        indexOf(Object o)
        remove(int index)
        remove(Object o)
        clear()
        * */

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            numbers.add(i);
        }

    }


}

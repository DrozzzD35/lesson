package work_22_03_2025;

import java.util.ArrayList;
import java.util.List;

public class Lesson {


    /*
    Iterable* -> Collection* | -> List*
                             | -> AbstractCollection** -> AbstractList** -> ArrayList***


    * - интерфейс
    ** - абстрактный класс
    *** класс


    ArrayList:
    - size (размер)
    - capacity (вместимость)

    * */

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(); // 0 - размер, 10 - вместимость

        //  Что произойдет если добавим 11 элемент? увеличение вместимости 50% к старой

    }

    public static void test1() {
        List<Integer> numbers = new ArrayList<>(5);

        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        // todo посмотреть методы списков
        numbers.addAll(numbers);

        System.out.println(numbers);
    }
    public static void test2() {

    }
    public static void test3() {

    }
}

package work_20_12_2024;

import work_19_12_2024.Car;

public class Lesson {

    //
    /*
    Методы - блоки кода выполняющие определенную логику \ действия
    Если есть повторяющийся код, то нужно его вынести в отдельный метод и этот метод ПЕРЕИСПОЛЬЗОВАТЬ!
    Пример переиспользования - метод min();

    сигнатура объявления метода:
    [модификаторы доступа] [тип возвращаемого значения] имяМетода([тип параметра1] имяПараметра1,....[тип параметра999] имяПараметра999){
        тело метода
        return выражение; (если метод что-то возвращает)
    }


    * */
    public static void main(String[] args) {
        // если метод возвращает, то мы должны этот результат куда-то сохранить!
        int x = sum(2, 3); // (2,3) аргументы метода
        System.out.println(x);

        int a = 10;
        printA(a);
        /*

        декомпозиция кода на методы:


        */

        int[] array = {1, 2, 3};
        int sum = getSum(array);
        System.out.println("Сумма: " + sum);

    }

    private static int getSum(int[] array) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }


    /*
    public - модификатор доступа
    static - специальное слово
    int - тип возвращаемого значения
    sum - имя метода
    (int a, int b) - параметры метода
    return result = возвращаем значение
    * */
    public static int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void printA(int a) {
        System.out.println(a);
    }

    public static void min() {
        int[] grades = {1, 2, 3};
        int min = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] < min) {
                min = grades[i];
            }
        }
        System.out.println(min);
    }

}

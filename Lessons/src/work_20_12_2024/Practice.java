package work_20_12_2024;

public class Practice {

    /*
    1.
    Упражнение "Метод приветствия":
        Напишите метод void greet(String name), который выводит "Привет, {name}".
        В main вызовите этот метод с разными именами.

    2.
    Упражнение "Возведение в квадрат":
        Напишите метод int square(int x), который возвращает квадрат числа x.
        Вызовите его в main и выведите результат.

    3.
    Упражнение "Проверка чётности":
        Напишите метод boolean isEven(int number), который возвращает true, если число чётное, иначе false.
        Проверьте работу метода на разных числах.

     4.
     Упражнение "Сумма элементов массива" (повторение):
        Напишите метод int sumArray(int[] arr), который возвращает сумму элементов массива.
        Проверьте на разных массивах.
    * */
    public static void main(String[] args) {
        // 1
        greet("pety");
        greet("Лиза");
        greet("Лёша");

        // 2
        int i = square(2); // i = 4;
        System.out.println(i);

        // 3
        System.out.println(isEven(4));
        System.out.println(isEven(5));
        System.out.println(isEven(6));

        // 4
        int[] numbers = {2, 4, 6};
        System.out.println(sumArray(numbers));
    }

    public static void greet(String name) {
        System.out.println("Привет " + name);

    }

    public static int square(int x) {
        return x * x;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}

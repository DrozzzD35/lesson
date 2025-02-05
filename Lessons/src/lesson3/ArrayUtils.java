package lesson3;

import java.util.Scanner;

public class ArrayUtils {

    public static void main() {
        System.out.println("Введите количество оценок: ");
        Scanner scanner = new Scanner(System.in);

        int array = scanner.nextInt();
        int[] grades = new int[array];

        for (int i = 0; i < grades.length; i++) {
            System.out.println("Введите оценки учеников: " + (i + 1));
            grades[i] = scanner.nextInt();
        }
        System.out.println("Максимальная оценка: " + max(grades));
        System.out.println("Минимальная оценка: " + min(grades));
        System.out.println("Средняя оценка: " + average(grades));


    }

    public static int max(int[] grades) {
        int max = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > max) {
                max = grades[i];
            }
        }
        return max;
    }


    public static int min(int[] grades) {
        int min = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] < min) {
                min = grades[i];
            }
        }
        return min;
    }

    public static double average(int[] grades) {
        double average = 0;
        int sum = sum(grades);
        average = (double) sum / grades.length;
        return average;
    }

    private static int sum(int[] grades) {
        int sum = grades[0];
        for (int i = 1; i < grades.length; i++) {
            sum += grades[i];
        }
        return sum;
    }

}

package work_20_12_2024;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = inputGrades();
        printGrades(arr);
        maxGrade(arr);
        minGrade(arr);
        averageGrade(arr);
    }

    public static int[] inputGrades() {
        return new int[]{-40, -30, -10, -20};
    }

    public static void printGrades(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int grades = arr[i];
            System.out.println("Оценка " + (i + 1) + ": " + grades);
        }
    }

    public static void maxGrade(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Максимальная оценка: " + max);
    }
/*
{40, 30, 10, 20}
min = 40
1) i = 30
     i < arr.length?
* */
    public static void minGrade(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Минимальная оценка: " + min);
    }

    public static void averageGrade(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double average = 0;
        average = (double) sum / arr.length;
        System.out.println("Средняя оценка: " + average);

    }
}

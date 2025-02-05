package work_20_12_2024;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        System.out.println("Введите количество трат: ");
        Scanner scanner = new Scanner(System.in);
        int array = scanner.nextInt();
        int[] expenses = new int[array];

        inputExpenses(expenses);
        sumArray(expenses);
        maxValue(expenses);
        average(expenses);


    }

    static int inputExpenses(int[] expenses) {
        Scanner scanner = new Scanner(System.in);
        int spend = 0;
        for (int i = 0; i < expenses.length; i++) {
            System.out.println("Введите сумму трат " + (i + 1));
            expenses[i] = scanner.nextInt();
            spend =   expenses[i];
        }
        return spend;
    }

    public static void sumArray(int[] expenses) {
        int sumArray = 0;
        for (int i = 0; i < expenses.length; i++) {
            sumArray += expenses[i];
        }
        System.out.println("Сумма трат состовляет: " + sumArray);
    }

    public static void maxValue(int[] expenses) {
        int maxValue = expenses[0];
        for (int i = 1; i < expenses.length; i++) {
            if (maxValue < expenses[i]) {
                maxValue = expenses[i];
            }
        }
        System.out.println("Максимальная трата составляет: " + maxValue);
    }

    public static void average(int[] expenses) {
        int sum = 0;
        for (int i = 0; i < expenses.length; i++) {
            sum += expenses[i];
        }
        double average = (double) sum / expenses.length;
        System.out.println("Среднее значение трат состовляет: " + average);
    }

}

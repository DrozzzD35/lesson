package lesson3;

import java.util.Scanner;

public class ExpenseTracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько трат вы хотите ввести?");

        int count = scanner.nextInt();
        int[] expenses = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.println("Ввести сумму траты " + (i + 1) + ": ");
            expenses[i] = scanner.nextInt();
        }

        System.out.println("Общая сумма трат: " + sumArray(expenses));
        System.out.println("Средняя трата " + average(expenses));
        System.out.println("Максимальная трата " + maxValue(expenses));
    }

    private static int maxValue(int[] expenses) {
        /*
         [1,4,2,5,3]

        * */
        int max = expenses[0];
        for (int i = 1; i < expenses.length; i++) {
            if (expenses[i] > max) {
                max = expenses[i];
            }
        }

        return max;
    }


    private static double average(int[] expenses) {
        double average = 0;
        int sum = sumArray(expenses);
        average = (double) sum / expenses.length;
        return average;
    }

    private static int sumArray(int[] expenses) {
        int sum = 0;
        for (int i = 0; i < expenses.length; i++) {
            sum += expenses[i];
        }
        return sum;
    }
}

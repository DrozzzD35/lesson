package work_06_03_25.godmethod.tasks.task2.solution;

import java.util.Random;

public class Processor {

    private int[] numbers;

    public void fillArray(int size) {
        numbers = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }
    }

    // [2, 3, 5]
    public int findMax() {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public int findMin() {
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public double findAverage() {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum / numbers.length;
    }

    public void printMaxMinAverageArray(){
        System.out.print("Array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("Max: " + findMax());
        System.out.println("Min: " + findMin());
        System.out.println("Average: " + findAverage());
        System.out.println();
    }

}

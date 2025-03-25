package work_21_03_2025.task2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Task<Integer> task = new Task<>();

        Integer[] arr = {1, 2, 3, 4, 5};

        System.out.println(task.countGreaterThan(arr, 3));

    }
}

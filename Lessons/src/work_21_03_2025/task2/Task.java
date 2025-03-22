package work_21_03_2025.task2;

public class Task<T> {

    // todo посмотреть Comparable и compareTo
    public static <T extends Comparable<T>> int countGreaterThan(T[] array, T elem) {
        int count = 0;
        for (T item : array) {
            if (item.compareTo(elem) > 0) {
                count++;
            }
        }
        return count;
    }
}

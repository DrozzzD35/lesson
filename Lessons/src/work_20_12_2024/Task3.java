package work_20_12_2024;

public class Task3 {
    public static void main() {
        int[] array = {4, 2, 6, 8, 8, 6};
        double average = average(array);
        System.out.println("Среднее значение array " + average);

        int[] arrayTwo = {};
        double averageTwo = average(arrayTwo);
        System.out.println("Среднее значение arrayTwo " + averageTwo);

        int[] arrayThree = {3,2,2,2};
        double averageThree = average(arrayThree);
        System.out.println("Среднее значение arrayThree " + averageThree);


    }

    public static double average(int[] array) {
        if(array.length == 0){
            return 0;
        }
        double average = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        average = (double) sum / array.length;
        return average;
    }
}

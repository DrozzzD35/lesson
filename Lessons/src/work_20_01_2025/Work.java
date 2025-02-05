package work_20_01_2025;

/**
 * Создайте класс MultiDimPractice. В нём объявите и проинициализируйте (вручную или циклом)
 * двумерный массив размером 5×5, который хранит таблицу умножения чисел от 1 до 5.
 * <p>
 * для таблицы 3х3
 * [0][0] = 1
 * [0][1] = 2
 * [0][2] = 3
 * <p>
 * [1][0] = 2
 * [1][1] = 4
 * [1][2] = 6
 * <p>
 * [2][0] = 3
 * [2][1] = 6
 * [2][2] = 9
 */
public class Work {
    public static void main(String[] args) {
        MultiDimPractice();
    }

    static void MultiDimPractice() {
        int[][] arr = new int[5][5];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (i + 1) * (j + 1);
                System.out.println(arr[i][j]);
            }

        }
    }
}

package algo.homeWork_20_01_25;

public class Task2 {
    public static void main(String[] args) {
        int[][][] arr = {{{3, 2}, {2, 3}}, {{3, 2}, {4, 2}}, {{5, 2}, {6, 7}}};   //[3][2][1]

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[j].length - 1; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }

            }
        }
    }
}

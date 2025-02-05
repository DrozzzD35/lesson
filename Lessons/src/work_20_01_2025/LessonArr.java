package work_20_01_2025;

public class LessonArr {

    public static void main(String[] args) {
//        begin();

        int[][][] table = new int[3][4][5];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    table[i][j][k] = k;
                    System.out.print(table[i][j][k] + " ");
                }

            }
        }

//        System.out.println(table);
        // Ссылки на массив
//        changeArr();


        // Подводные камни:
        /*
         1) Путаница с индексами: table[i][j], i не может быть больше table.length - 1, а j не может быть больше table[i].length -1
         2) ступенчатая структура не  обязательно прямоугольная
         3) присвоение ссылок (массивы это ссылки\объекты)
         4) int[][] - нули. String[][] - null
        * */

    }

    private static void begin() {
        int[][] table = new int[3][4]; // {{},{}}
        // обычный одномерный - [ 1,2,3 ]
        // двумерный - [ [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0] ]
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                table[i][j] = j;
//                table[i][j] = i*4+j+1;
                System.out.println(table[i][j] + " ");
            }
            System.out.println();
        }


        int[][] table2 = new int[3][];

        table2[0] = new int[3];
        table2[1] = new int[2];
        table2[2] = new int[5];
    }


    private static void changeArr() {
        int[] num1 = new int[10];
        int[] num2 = new int[10];
        int[] num3 = new int[10];
        int[] num4 = new int[10];
        int[] num5 = new int[10];

        for (int i = 0; i < 10; i++) {
            num1[i] = i;
        }

        num2 = num1;
        num3 = num1;
        num4 = num1;
        num5 = num1;
        num2[3] = 99;

//        System.out.println(num1[3]);

        int ageVasay = 20;
        int ageAnna = 25;

        ageAnna = ageVasay;
        ageAnna = 55;

        System.out.println(ageVasay);

    }

    private void copyStaticArr() {
        int[] numbers = new int[3];

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        int[] copyNumbers = new int[numbers.length + 2];

        for (int i = 0; i < numbers.length; i++) {
            copyNumbers[i] = numbers[i];
        }

        copyNumbers[3] = 3;
        copyNumbers[4] = 4;
    }

}

package work_20_12_2024;

public class Task1 {
    public static void main(String[] args) {
        int sum = sum(25, 35);
        System.out.println("Сумма равна " + sum);

        int min = min(3, 3);
        System.out.println("Минимальное число " + min);

        int max = max(78, 58);
        System.out.println("Максимальное число " + max);

    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int min(int a, int b) {
//        if (a < b) {
//            return a;
//        } else if (a > b) {
//            return b;
//        }
//        return a;

//        if(a<=b){
//            return a;
//        }
//        return b;


        // TODO тернарный оператор: условие ? если выполнился : если не выполнился;
        return (a <= b) ? a : b;
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else if (a < b) {
            return b;
        }
        return a;
    }


}

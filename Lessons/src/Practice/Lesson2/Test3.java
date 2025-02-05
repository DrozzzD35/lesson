package Practice.Lesson2;

public class Test3 {

    public static void main(String[] args) {
        int[] anArray = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};

        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto"};

        String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 0, 9);
        for (String coffee : copyTo) {
            System.out.println(coffee + " ");
        }
        System.out.println(anArray.length);

        int[][] name = {{2, 3, 4},{5,6,7,1,2},{3,4,5},{7,8,9}};
        System.out.println(name[3][2]);

        int binVal = 0b11010;
        System.out.println(binVal);
        System.out.println(binVal);




    }
}


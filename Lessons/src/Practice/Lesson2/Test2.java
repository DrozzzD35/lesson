package Practice.Lesson2;

import static java.util.Collections.binarySearch;

public class Test2 {
    public static void main(String[] args) {
        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto"};

//        int copySearch = binarySearch(2);
//        System.out.println(copySearch);

        String[] copyTo = new String[7];
        System.arraycopy(copyFrom, 5, copyTo, 3, 4);
        for (String coffee : copyTo) {
            System.out.println(coffee + " ");
        }
        System.out.println(java.util.Arrays.toString(copyFrom));
    }

    private static String binarySearch(String[] copyFrom) {
        return "Frappucinossadasd";
    }
}





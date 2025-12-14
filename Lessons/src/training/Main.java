package training;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String s = "5 -2 0 0 7 8 -1";

        calculateStats(s);
    }


    static String calculateStats(String input) {
        String[] strings = input.trim().split(" ");

        int a = 0;
        int b = 0;
        int c = 0;

        for (String number : strings) {
            int value = Integer.parseInt(number);

            if (value > 0) {
                a++;
            } else if (value < 0) {
                b++;
            } else {
                c++;
            }

        }

        return "выше нуля: " + a + ", ниже нуля: " + b + ", равна нулю: " + c;

    }
}

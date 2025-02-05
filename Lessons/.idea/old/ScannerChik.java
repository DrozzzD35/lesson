package old;

import java.util.Scanner;

public class ScannerChik {
    public static void main(String[] args) {
        String x = new String("бегемот");
        System.out.println(x);
        Scanner s = new Scanner(System.in);
        System.out.println("write something");
        String string = s.nextLine();
        System.out.println("you write " + string);
    }
}

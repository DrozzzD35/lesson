package Practice.youTube;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите сумму денег");
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        int division10 = money % 10;
        int division100 = money % 100;

        if (division10 == 0 || division10 >= 5 || division100 >= 11 && division100 <= 19) {
            System.out.println(money + " рублей");
        } else if (division10 >= 2) {
            System.out.println(money + " рубля");
        } else if (division10 == 1) {
            System.out.println(money + " рубль");
        } else {
            System.out.println("Ошибка ввода");
        }
    }
}

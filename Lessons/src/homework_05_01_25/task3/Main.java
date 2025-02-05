package homework_05_01_25.task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя пользователя:");
        String name = scanner.nextLine();
        homework_05_01_25.task3.PersonAccount user = new homework_05_01_25.task3.PersonAccount(name);

        System.out.println("Хотите открыть счёт в RUB?");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        int command = scanner.nextInt();
        if (command == 1) {
            user.moneyRUB = String.valueOf(0.0);
        }

        System.out.println("Хотите открыть счёт в USD?");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        command = scanner.nextInt();
        if (command == 1) {
            user.moneyUSD = String.valueOf(0.0);
        }

        System.out.println("Хотите открыть счёт в EUR?");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        command = scanner.nextInt();
        if (command == 1) {
            user.moneyEUR = String.valueOf(0.0);
        }

        System.out.println("Поздравляем, аккаунт для пользователя " + user.name + " создан.");
        System.out.println("Открытые счета:");
        if (user.moneyRUB == String.valueOf(0.0)) {
            System.out.println("- RUB");
        }
        if (user.moneyUSD == String.valueOf(0.0)) {
            System.out.println("- USD");
        }
        if (user.moneyEUR == String.valueOf(0.0)) {
            System.out.println("- EUR");
        }

    }
}

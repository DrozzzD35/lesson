package homeWork_03_02_2025.task6;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        MonthlyReport monthlyReport = new MonthlyReport();
        Manager manager = new Manager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            printMenu();
            System.out.println("Введите команду (1-6)");
            int command = scanner.nextInt();
            if (command == 1) {
                manager.readAllMonthReports();
            }
            if (command == 2) {
                manager.readAllYearReports();
            }
            if (command == 3) {
                System.out.println("Введите год проверки");
                manager.verifyReports(scanner.nextInt());
            }
            if (command == 4) {
                manager.printMonthReport();
            }
            if (command == 5) {
                manager.printYearReport();
            }
            if (command == 6) {
                return;
            }
        }
    }

    public static void printMenu() {
        System.out.println("1. Считать все месячные отчёты");
        System.out.println("2. Считать годовой отчёт");
        System.out.println("3. Сверить отчёты");
        System.out.println("4. Вывести информацию о месячных отчётах");
        System.out.println("5. Вывести информацию о годовом отчёте");
        System.out.println("6. Выйти");
        System.out.println();
    }

}

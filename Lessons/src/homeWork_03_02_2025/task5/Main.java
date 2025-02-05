package homeWork_03_02_2025.task5;

import homeWork_03_02_2025.task2.MonthlyReport;
import homeWork_03_02_2025.task4.YearlyReport;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        MonthlyReport monthlyReport = new MonthlyReport();
        YearlyReport yearlyReport = new YearlyReport();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            System.out.println("Введите команду (1-6)");
            int command = scanner.nextInt();
            if (command == 1) {
                monthlyReport.MonthlyReportList();
                monthlyReport.printReportList();
            }
            if (command == 2) {
                yearlyReport.yearlyReportList();
                yearlyReport.printYReportList();
            }
            if (command == 3) {
                continue;
            }
            if (command == 4) {
                continue;
            }
            if (command == 5) {
                continue;
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

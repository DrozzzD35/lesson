package homeWork_03_02_2025.task6;


import homeWork_03_02_2025.task2.MonthlyReport;
import homeWork_03_02_2025.task4.ReadingFileTask4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class YearlyReport {
    private int year;
    private List<YearlyReportItem> yearlyReportList = new ArrayList<>();


    public List<YearlyReportItem> getYearlyReportList() {
        return yearlyReportList;
    }

    public void yearlyReportList(String fileName) throws IOException {
        List<String> yearReport = ReadingFileTask6.ReadFileYear(fileName);
        for (String str : yearReport) {
            if (str.equals("month,amount,is_expense")) {
                continue;
            }
            String[] strSplit = str.split(",");

            int monthNumber = Integer.parseInt(strSplit[0]);
            double amount = Double.parseDouble(strSplit[1]);
            boolean isExpense = Boolean.parseBoolean(strSplit[2]);

            YearlyReportItem yearlyReportItem = new YearlyReportItem(monthNumber, amount, isExpense);
            yearlyReportList.add(yearlyReportItem);

        }
    }

    public void printYReportList() {
        for (YearlyReportItem str : yearlyReportList) {
            System.out.print("Месяц " + str.getMonthNumber());
            System.out.print(". Сумма " + str.getAmount());
            if (str.getIsExpense()) {
                System.out.print(" Продано");
                System.out.println();
            } else {
                System.out.println(" Заказано");
                System.out.println();
            }
        }
    }

    public double getTotalIncome() {
        double totalSum = 0;
        for (YearlyReportItem item : yearlyReportList) {
            if (!item.getIsExpense()) {
                totalSum += item.getAmount();
            }
        }
        return totalSum;
    }

    public double getTotalExpense() {
        double totalSum = 0;
        for (YearlyReportItem item : yearlyReportList) {
            if (item.getIsExpense())
                totalSum += item.getAmount();
        }
        return totalSum;
    }


}

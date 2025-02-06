package homeWork_03_02_2025.task2;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MonthlyReport {
    List<String> monthlyReportList;
    List<MonthlyReportItem> monthlyReports = new ArrayList<>();
    private double sumItem = 0;
    private double sumExpense = 0;

    public void MonthlyReportList(){
        monthlyReportList = ReadingFileTask2.ReadFile();
        for (String str : monthlyReportList) {
            if (str.equals("item_name,is_expense,quantity,sum_of_one")) {
                continue;
            }
            String[] strSplit = str.split(",");

            String itemName = strSplit[0];
            boolean isExpense = Boolean.parseBoolean(strSplit[1]);
            int quantity = Integer.parseInt(strSplit[2]);
            double unitPrice = Double.parseDouble(strSplit[3]);

            MonthlyReportItem monthlyReportItem = new MonthlyReportItem(itemName, isExpense, quantity, unitPrice);
            monthlyReports.add(monthlyReportItem);
        }

    }


    public void printReportList() {
        for (MonthlyReportItem itemList : monthlyReports) {
            System.out.print(itemList.getItemName());
            if (itemList.getExpense()) {
                System.out.print(". Товар продан");
            } else {
                System.out.print(". Товар заказан");
            }
            System.out.print(". Количество: " + itemList.getUnitPrice());
            System.out.print(". Цена: " + itemList.getQuantity());
            System.out.println();
        }
        System.out.println();

    }

    public double getTotalIncome() {
        double unitPrice = 0;
        int quantity = 0;
        for (MonthlyReportItem str : monthlyReports) {
            if (str.getExpense()) {
                unitPrice += str.getUnitPrice();
                quantity += str.getQuantity();
                sumItem += unitPrice * quantity;
                quantity *= 0;
                unitPrice *= 0;
            }
        }
        return sumItem;
    }

//    public double getTotalExpense() {
//        double unitPrice = 0;
//        int quantity = 0;
//        for (MonthlyReportItem str : monthlyReports) {
//            if (!str.getExpense()) {
//                unitPrice += str.getUnitPrice();
//                quantity += str.getQuantity();
//                sumExpense += unitPrice * quantity;
//                quantity *= 0;
//                unitPrice *= 0;
//            }
//        }
//        return sumExpense;
//    }
    public double getTotalExpense() {
        double totalSum = 0;
        for (MonthlyReportItem item : monthlyReports) {
            if (item.getExpense()) {
                totalSum += item.getQuantity() * item.getUnitPrice();
            }
        }
        return totalSum;
    }

    /*
    1) нужна переменная которая хранит сумму
    2) нужен цикл для перебора элементов массива
    3) нам нужны только траты
    4) сложить все траты в переменную
    5) вернуть переменную
     */
}



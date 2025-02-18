package homeWork_03_02_2025.task2;


import java.util.ArrayList;
import java.util.List;

public class MonthlyReport {
    List<String> monthlyReportList;
    List<MonthlyReportItem> monthlyReports = new ArrayList<>();

    public void monthlyReportList(){
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


}



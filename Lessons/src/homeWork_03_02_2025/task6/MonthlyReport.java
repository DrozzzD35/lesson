package homeWork_03_02_2025.task6;


import java.util.ArrayList;
import java.util.List;

public class MonthlyReport {
    private int month;
    private int year;
    private List<MonthlyReportItem> items = new ArrayList<>();

    public void monthlyReportList(String fileName) {
        List<String> monthlyReports = ReadingFileTask6.ReadFile(fileName);
        for (String str : monthlyReports) {
            if (str.equals("item_name,is_expense,quantity,sum_of_one")) {
                continue;
            }
            String[] strSplit = str.split(",");

            String itemName = strSplit[0];
            boolean isExpense = Boolean.parseBoolean(strSplit[1]);
            int quantity = Integer.parseInt(strSplit[2]);
            double unitPrice = Double.parseDouble(strSplit[3]);

            MonthlyReportItem monthlyReportItem = new MonthlyReportItem(itemName, isExpense, quantity, unitPrice);
            items.add(monthlyReportItem);
        }

    }



    public void printReportList() {
        for (MonthlyReportItem itemList : items) {
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
        double totalSum = 0;
        for (MonthlyReportItem item : items) {
            if (!item.getExpense()) {
                totalSum += item.getQuantity() * item.getUnitPrice();
            }
        }
        return totalSum;
    }

    public double getTotalExpense() {
        double totalSum = 0;
        for (MonthlyReportItem item : items) {
            if (item.getExpense()) {
                totalSum += item.getQuantity() * item.getUnitPrice();
            }
        }
        return totalSum;
    }

//    boolean verifyReports(YearlyReport yearlyReport, Map<Integer, MonthlyReport> monthlyReports) {
//        for (YearlyReportItem items : yearlyReport.yearlyReportList) {
//            if (items.getMonthNumber()==1){
//                monthlyReports.put(items.getMonthNumber(),MonthlyReport )
//            }
//        }

}



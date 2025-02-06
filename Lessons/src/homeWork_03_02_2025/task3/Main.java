package homeWork_03_02_2025.task3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        MonthlyReport monthlyReport = new MonthlyReport();
        monthlyReport.MonthlyReportList();
        monthlyReport.printReportList();


        double sumExpense = monthlyReport.getTotalExpense();
        double sumIncome = monthlyReport.getTotalIncome();
        System.out.println("Сумма всех расходов: "+sumExpense);
        System.out.println("Сумма доходов: "+sumIncome);
    }
}

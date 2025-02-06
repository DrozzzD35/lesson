package homeWork_03_02_2025.task6;

import homeWork_03_02_2025.task2.MonthlyReport;

import java.util.Map;

public class VerifyReports {
    boolean verifyReports(YearlyReport yearlyReport, Map<Integer, MonthlyReport> monthlyReports) {
        for (YearlyReportItem items : yearlyReport.yearlyReportList) {
            monthlyReports.put(items.getMonthNumber(), )
        }
    }

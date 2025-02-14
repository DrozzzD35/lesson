package homeWork_03_02_2025.task6;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Manager {
    private Map<Integer, YearlyStatistic> yearlyStatistics;

    public Manager() {
        this.yearlyStatistics = new HashMap<>();
    }


    void verifyReports(YearlyReport yearlyReport, Map<Integer, MonthlyReport> monthlyReports) {
    }

    public void readAllMonthReports() {
        List<String> monthFilesName = getFileNameSByType(ReportType.MONTHLY);
        System.out.println("Начали запись месячных отчетов");
        YearlyStatistic yearlyStatistic = new YearlyStatistic();

        for (String fileName : monthFilesName) {

            int year = defineYearByFileName(fileName);
            int month = defineMonthByFileName(fileName);

            MonthlyReport monthlyReport = new MonthlyReport(month, year);
            List<String> rows = FileService.readFile(fileName);

            for (int i = 1; i < rows.size(); i++) {
                String row = rows.get(i);

                String[] strSplit = row.split(",");

                String itemName = strSplit[0];
                boolean isExpense = Boolean.parseBoolean(strSplit[1]);
                int quantity = Integer.parseInt(strSplit[2]);
                double unitPrice = Double.parseDouble(strSplit[3]);

                MonthlyReportItem monthlyReportItem = new MonthlyReportItem(itemName, isExpense, quantity, unitPrice);
                monthlyReport.add(monthlyReportItem);
            }

            yearlyStatistic.setMonthlyReport(monthlyReport);
            yearlyStatistics.put(year, yearlyStatistic);
        }

        System.out.println("Закончили запись месячных отчетов");
    }

    private int defineMonthByFileName(String fileName) {
        String[] parts = fileName.split("\\.");
        return Integer.parseInt(parts[1].substring(4, 6));
    }

    private int defineYearByFileName(String fileName) {
        String[] parts = fileName.split("\\.");
        return Integer.parseInt(parts[1].substring(0, 4));
    }

    private List<String> getFileNameSByType(ReportType type) {
        List<String> fileNames = new ArrayList<>();
        String nameStartWith = type == ReportType.MONTHLY ? "m." : "y.";
        try {
            fileNames = Files.walk(Paths.get("src/homeWork_03_02_2025/resources"))
                    .filter(pathName -> {
                        String path = pathName.toString().toLowerCase(Locale.ROOT);
                        return (path.contains(nameStartWith)) && path.endsWith(".csv");
                    })
                    .map(file -> file.getFileName().toString())
                    .toList();
        } catch (Exception e) {
            System.out.println("Произошла ошибка при получении названии файлов");
        }
        return fileNames;
    }
}

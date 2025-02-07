package homeWork_03_02_2025.task6;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Manager {
    MonthlyReport monthlyReport = new MonthlyReport();

    public void readReports() {
        File folder = new File("src/homeWork_03_02_2025/resources");
        File[] listFile = folder.listFiles();
        for (File file : listFile) {
            if (file.isFile()) {
                monthlyReport.fileName.add(file.getName());
            }
        }
    }


    void verifyReports(YearlyReport yearlyReport, Map<Integer, MonthlyReport> monthlyReports) {
    }
}

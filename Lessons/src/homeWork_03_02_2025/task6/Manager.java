package homeWork_03_02_2025.task6;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.*;

public class Manager {
    private List<String> fileName;
    MonthlyReport monthlyReport = new MonthlyReport();
    YearlyReport yearlyReport = new YearlyReport();

    public void readResources() throws IOException {
        File folder = new File("src/homeWork_03_02_2025/resources");
        fileName = new ArrayList<>(Arrays.asList(Objects.requireNonNull(folder.list())));
        for (String str:fileName){
            if (str.startsWith("y")){
                yearlyReport.yearlyReportList(str);
            } else if (str.startsWith("m")){
                monthlyReport.monthlyReportList(str);
            }
        }
    }


    void verifyReports(YearlyReport yearlyReport, Map<Integer, MonthlyReport> monthlyReports) {
    }
}

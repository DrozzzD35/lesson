package homeWork_03_02_2025.task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReadingFile {
    public static void main(String[] args) throws IOException {
        String path = "src/homeWork_03_02_2025/resources/m.202101.csv";
        List<String> file = Files.readAllLines(Path.of(path));
        for (String str : file) {
            if (str.equals("item_name,is_expense,quantity,sum_of_one")) {
                continue;
            }
            String[] strSplit = str.split(",");

            for (String s : strSplit) {
                System.out.print(s + " ");
            }
        }
    }
}

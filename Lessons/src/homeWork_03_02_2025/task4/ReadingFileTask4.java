package homeWork_03_02_2025.task4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ReadingFileTask4 {
    public static List<String> ReadFile(String fileName) {
        String path = "C:\\Program Files\\Java\\Lessons\\Lessons\\src\\homeWork_03_02_2025\\y.2021.csv";
        try {
            return new ArrayList<>(Files.readAllLines(Path.of(path)));
        } catch (IOException e) {
            System.out.println("Ошибка. Возможно не найден файл");
            return new ArrayList<>();
        }
    }
}

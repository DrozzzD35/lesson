package homeWork_03_02_2025.task6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ReadingFileTask6 {
    public static List<String> ReadFile(String fileName) {
        String path = "src/homeWork_03_02_2025/resources/"+fileName;
        try {
            return new ArrayList<>(Files.readAllLines(Path.of(path)));
        } catch (IOException e) {
            System.out.println("Ошибка. Возможно не найден файл");
            return new ArrayList<>();
        }
    }
}

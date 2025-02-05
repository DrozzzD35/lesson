package homeWork_03_02_2025.task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ReadingFileTask2 {
    public static List<String> ReadFile(String filename) {
        String path = "C:\\Program Files\\Java\\Lessons\\Lessons\\src\\homeWork_03_02_2025\\" + filename; // todo посмотреть как получить пусть из resources
        try {
            return new ArrayList<>(Files.readAllLines(Path.of(path)));
        } catch (IOException e) {
            System.out.println("Ошибка. Возможно не найден файл");
            return new ArrayList<>();
        }
    }
}

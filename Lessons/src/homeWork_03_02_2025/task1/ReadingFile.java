package homeWork_03_02_2025.task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReadingFile {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Program Files\\Java\\Lessons\\Lessons\\src\\homeWork_03_02_2025\\m.202101.csv";
        List<String> file = Files.readAllLines(Path.of(path));
        for (String str : file) {
            String[] strSplit = str.split(",");
            if (file.get(0).equals(str)) { //todo
                continue;
            }
            System.out.println(str); // todo вывод элементов строки (не зря же сплитили)
        }
    }
}

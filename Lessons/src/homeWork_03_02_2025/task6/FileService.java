package homeWork_03_02_2025.task6;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileService {

    public static List<String> readFile(String fileName)  {
        // todo посмотреть метод получение урла к ресурсам


//        URL resource = FileService.class.getResource("/resources/");



        String path = "./resources/"+fileName;

//        Path path= Paths.get("/fileName");
        try {
            return new ArrayList<>(Files.readAllLines(Path.of(path)));
        } catch (IOException e) {
            System.out.println("Ошибка. Возможно не найден файл");
            return new ArrayList<>();
        }
    }

}

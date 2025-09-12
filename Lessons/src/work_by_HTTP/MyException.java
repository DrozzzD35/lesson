package work_by_HTTP;

import java.io.IOException;
import java.net.ConnectException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpConnectTimeoutException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MyException {


    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();
        try {
            HttpRequest httpRequest = HttpRequest.newBuilder()
                    .uri(URI.create("https://cbr.ru/currency_base/daily/"))
                    .header("Accept", "text/html")
                    .GET()
                    .build();

            try {
                HttpResponse<String> response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            }catch (ConnectException e){ // Нет соединения с интернетом
                System.out.println("Проверьте соединение");
            }catch (IOException | InterruptedException e){
                System.out.println("Превышено ожидание ответа от сервера");

            }

        }catch (IllegalArgumentException e){
            System.out.println("Неправильный формат урла!");
        }






    }

}

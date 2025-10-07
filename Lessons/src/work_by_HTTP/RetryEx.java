package work_by_HTTP;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RetryEx {

    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create("https://cbr.ru/currency_base/daily/"))
                .header("Accept", "text/html")
                .GET()
                .build();
//        HttpResponse<String> response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());
    }

    public static String sendWithRetry(HttpRequest request, HttpClient client, int maxAttempts) {

        int attempt = 0;
        while (attempt < maxAttempts) {

            try {

                attempt++;
                System.out.println("Попытка номер: " + attempt);

                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                if (response.statusCode() == 200) {
                    return response.body();
                }

                if (response.statusCode() >= 500) {
                    System.out.println("Ошибка сервера, пробую еще раз...");
                    Thread.sleep(2000);
                    continue;
                }

                if (response.statusCode() >= 400) {
                    System.out.println("Ошибка запроса, повтор не поможет");
                    return null;
                }

            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
                if (attempt < maxAttempts) {
                    try {
                        Thread.sleep(1000L * attempt);
                    } catch (InterruptedException ex) {
                        break;
                    }
                }
            }


        }

        return "";
    }


}

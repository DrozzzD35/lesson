package work_by_HTTP.client;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GetRequestEx {

    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

//        getCB(client);

//        getGithubInfo(client);

//        createPost(client);

    }

    private static void createPost(HttpClient client) throws IOException, InterruptedException {
        String jsonData = """
                {
                    "title": "Мой первый пост",
                    "body": "Это содержание поста",
                    "userId": 1
                }
                """;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(jsonData))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Создали новый пост");
        System.out.println(response.body());
    }

    private static void getGithubInfo(HttpClient client) throws IOException, InterruptedException {
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create("https://api.github.com/users/DrozzzD35"))
                .header("Accept", "application/json")
                .GET()
                .build();

        HttpResponse<String> response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());

        System.out.println("Код ответа: " + response.statusCode());
        System.out.println("Тело ответа: " + response.body());
    }

    private static void getCB(HttpClient client) throws IOException, InterruptedException {
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create("https://cbr.ru/currency_base/daily/"))
                .header("Accept", "text/html")
                .GET()
                .build();

        HttpResponse<String> response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());

        System.out.println("Код ответа: " + response.statusCode());
        System.out.println("Тело ответа: " + response.body());
    }

}

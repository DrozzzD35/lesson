package work_by_HTTP.client;

import java.net.http.HttpClient;
import java.time.Duration;

public class ClientEx {

    public static void main(String[] args) {
        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .connectTimeout(Duration.ofSeconds(10))
                .build();
    }


}

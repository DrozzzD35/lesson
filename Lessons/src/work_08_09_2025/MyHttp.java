package work_08_09_2025;

import java.net.URI;
import java.net.http.HttpRequest;

public class MyHttp {

    public static void main(String[] args) {
        // сервер, клиент,
        // url - адрес в интернете:
        // https:// - протокол, способ общения. Выбор языка для разговора\
        // www.youtube.com - адрес сервера, как адрес дома
        // /watch  - путь к конкретной странице, к квартире в этом доме.
        // ?v=sdsdswed3  - параметры, дополнительная информация. Записка к двери

        //  Создаем url:
        URI youtubeUrl = URI.create("https://www.youtube.com/watch?v=luN-tRLZC24");


        // GET  /users
        // put  /users   (тело запроса)
        // Post  /users   (тело запроса)
        // patch  /users   (тело запроса)
        // delete  /users


        // 200-299  Отлично
        // 400-499  - Ты сделал что-то не так
        // 500-599  - проблемы на сервера

        // Content-type: application/json
        // Accept
        // Authorization: Bearer

        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(youtubeUrl)
                .header("Accept","application/json")
                .header("User-Agent","my phone")
                .GET()
                .build();

    }

}

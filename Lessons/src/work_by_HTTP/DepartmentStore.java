package work_by_HTTP;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

public class DepartmentStore {

    public static void main(String[] args) throws IOException {

        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        server.createContext("/toys", exchange -> {
            String response = "";

            String method = exchange.getRequestMethod();

            response = switch (method) {
                case "GET" -> "Список игрушек";
                case "POST" -> "Добавили игрушку";
                case "DELETE" -> "Удалили игрушку";
                default -> "Что-то я не понял ";
            };

            sendResponse(exchange, response);
        });

        server.createContext("/food", exchange -> {
            String response = "Добро пожаловать в отдел продуктов";
            sendResponse(exchange, response);
        });

        server.createContext("/checkout", exchange -> {
            String response = "Спасибо за покупку";
            sendResponse(exchange, response);
        });
        server.start();
    }

    private static void sendResponse(HttpExchange exchange, String response) throws IOException {

        byte[] responseBytes = response.getBytes(StandardCharsets.UTF_8);
        exchange.getResponseHeaders().set("Content-Type", "text/html; charset=UTF-8");
        exchange.sendResponseHeaders(200, responseBytes.length);

        OutputStream os = exchange.getResponseBody();
        os.write(responseBytes);
        os.close();

    }
}

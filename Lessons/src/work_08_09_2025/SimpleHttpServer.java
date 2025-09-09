package work_08_09_2025;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class SimpleHttpServer {

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        server.createContext("/hello", new HelloServer());
        server.createContext("/myFriends", new HelloServer());
        server.start();
    }

    static  class HelloServer implements HttpHandler{
        public void handle (HttpExchange exchange) throws IOException{
            String responce = "Привет, ты сюда попал";
            exchange.sendResponseHeaders(200, responce.length());

            OutputStream os = exchange.getResponseBody();
            os.write(responce.getBytes());
            os.close();

        }
    }

}

package work_by_HTTP;

import java.net.http.HttpResponse;

public class ResponseHandler {

    public static void handlerResponse(HttpResponse<String> response){
        int statusCode = response.statusCode();

        if(statusCode>= 200 && statusCode<300){
            System.out.println("Успех, все хорошо, данные получены");
            System.out.println(response.body());
        }else if(statusCode>=400 && statusCode< 500){
            System.out.println("Ошибка запроса");

            switch (statusCode){
                case 400:
                    System.out.println("Неверный формат запроса");
                    break;
                case 401:
                    System.out.println("Нужна авторизация");
                case 404:
                    System.out.println("Страница не найдена");
                    break;
                default:
                    System.out.println("Ошибка клиента "+ statusCode);
            }
        }else if (statusCode>=500){
            System.out.println("Ошибка сервера: "  +statusCode);
            System.out.println("Попробуйте попозже");
        }
    }

}

package work_25_06_2025;

public class Main {
    public static void main(String[] args) {


        Temperature<Scale> celsius = new Temperature<>(100, Scale.CELSIUS);
        TemperatureConverter converter = new TemperatureConverter();

        // Конвертация в Фаренгейт
        Temperature<Scale> fahrenheit = converter.convert(celsius, Scale.FAHRENHEIT);

        // Конвертация в Кельвин
        Temperature<Scale> kelvin = converter.convert(celsius, Scale.KELVIN);

        System.out.println("Исходная: " + celsius.getValue() + " C");
        System.out.println("Фаренгейт: " + fahrenheit.getValue() + " F");
        System.out.println("Кельвин: " + kelvin.getValue() + " K");
    }
}
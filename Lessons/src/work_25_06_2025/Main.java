package work_25_06_2025;

public class Main {
    public static void main(String[] args) {
        Temperature<Scale> celsius = new Temperature<>(100, Scale.CELSIUS);
        TemperatureConverter converter = new TemperatureConverter();

// Конвертация в Фаренгейт
        Temperature<Scale.FAHRENHEIT> fahrenheit =
                converter.convert(celsius, Scale.FAHRENHEIT.class);

// Конвертация в Кельвин
        Temperature<Scale.KELVIN> kelvin =
                converter.convert(celsius, Scale.KELVIN.class);

        System.out.println("Исходная: " + celsius.getValue() + " C");
        System.out.println("Фаренгейт: " + fahrenheit.getValue() + " F");
        System.out.println("Кельвин: " + kelvin.getValue() + " K");
    }
}

package work_25_06_2025;

import static work_25_06_2025.Scale.CELSIUS;
import static work_25_06_2025.Scale.FAHRENHEIT;

public class TemperatureConverter {


    public <S extends Scale, D extends Scale> Temperature<D> convert(Temperature<Scale> source, D targetScale) {

        double celsiusValue = toCelsius(source.getValue(), source.getScale());
        double resultValue = fromCelsius(celsiusValue, targetScale);

        return new Temperature<>(resultValue, targetScale);


    }


    public double toCelsius(double value, Scale source) {

        switch (source) {
            case CELSIUS -> {
                return value;
            }
            case FAHRENHEIT -> {
                return (value - 32) * 5 / 9;
            }
            case KELVIN -> {
                return value - 273.15;
            }
            default -> {
                throw new RuntimeException("Неизвестная шкала: " + source);
            }
        }

    }

    public double fromCelsius(double value, Scale source) {

        switch (source) {
            case CELSIUS -> {
                return value;
            }
            case FAHRENHEIT -> {
                return (value * 9 / 5) + 32;
            }
            case KELVIN -> {
                return value + 273.15;
            }
            default -> {
                throw new RuntimeException("Неизвестная шкала: " + source);
            }
        }
    }

}

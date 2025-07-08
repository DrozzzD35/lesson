package work_25_06_2025;

import static work_25_06_2025.Scale.CELSIUS;
import static work_25_06_2025.Scale.FAHRENHEIT;

public class TemperatureConverter {


    public <S extends Scale, D extends Scale> Temperature<D> convert(
            Temperature<S> source, Class<D> targetScale) {


        if (targetScale.equals(FAHRENHEIT.getClass())){

        }



        if (source.getScale().equals(Scale.FAHRENHEIT)) {
            source.setValue((source.getValue() * 9 / 5) + 32);
        } else if (source.getScale().equals(CELSIUS)) {
            source.setValue((source.getValue() * 9 / 5) + 32);
        }


    }


}

package work_25_06_2025;

public class Temperature<T extends Scale> {
    private double value;
    private T scale;

    public Temperature(double value, T scale) {
        this.value = value;
        this.scale = scale;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public T getScale() {
        return scale;
    }

    public void setScale(T scale) {
        this.scale = scale;
    }
}

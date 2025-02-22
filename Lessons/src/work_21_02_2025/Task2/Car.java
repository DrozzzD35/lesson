package work_21_02_2025.Task2;

public class Car extends Vehicle{
    private int maxPassengers;

    public Car(String brand, int speed, int maxPassengers) {
        super(brand, speed);
        this.maxPassengers = maxPassengers;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    @Override
    public void moveTo(String destination) {

    }
}

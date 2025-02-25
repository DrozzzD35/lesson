package work_21_02_2025.Task2;

public class Truck extends Vehicle {
    public double currentLoad;
    public double maxCapacity;

    public Truck(String brand, int speed, double maxCapacity) {
        super(brand, speed);
        this.currentLoad = 0;
        this.maxCapacity = maxCapacity;
    }

    public double getCurrentLoad() {
        return currentLoad;
    }

    public double getMaxCapacity() {
        return maxCapacity;
    }

    @Override
    public void moveTo(String destination) {
        setStatus(Status.ON_WAY);
        System.out.println("Грузовик бренда " + getBrand() + " отправляется в " + destination + " со скоростью +" + getSpeed());
    }
}

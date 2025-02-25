package work_21_02_2025.Task2;

public abstract class Vehicle {
    private String brand;
    private int speed;
    private Status status;
    private boolean needRepair;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
        this.status = Status.PARKING;
        this.needRepair = false;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public Status getStatus() {
        return status;
    }

    public abstract void moveTo(String destination);

    public void setNeedRepair(boolean needRepair) {
        this.needRepair = needRepair;
    }

    public boolean isNeedRepair() {
        return needRepair;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", speed=" + speed +
                ", status=" + status +
                ", needRepair=" + needRepair +
                '}';
    }
}

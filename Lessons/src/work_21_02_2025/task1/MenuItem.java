package work_21_02_2025.task1;

public abstract class MenuItem {
    private String name;
    private double price;
    protected Status status;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.status = Status.ORDER;
    }

    public String getName() {
        return name;
    }

    public Status getStatus() {
        return status;
    }

    public double getPrice() {
        return price;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public abstract void prepare();


    public abstract void serve();
}

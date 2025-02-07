package work_06_02_25.task1;

public abstract class MenuItem {
    protected String name;
    protected double price;
    protected Status status;


    public double getPrice() {
        return price;
    }

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.status = Status.ORDER;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public abstract void prepare();


    public abstract void serve();
}

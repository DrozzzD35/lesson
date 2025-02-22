package work_21_02_2025.task1;

public class Dish extends MenuItem {

    public Dish(String name, double price) {
        super(name, price);
    }

    @Override
    public void prepare() {
        setStatus(Status.PREPARE);
        System.out.println("Готовится на кухне " + getName());
    }

    @Override
    public void serve() {
        setStatus(Status.SOLD);
        System.out.println("Подаём к столу " + getName());
    }
}

package work_06_02_25.task1;

public class Dish extends MenuItem {

    public Dish(String name, double price) {
        super(name, price);
    }

    @Override
    public void prepare() {
        setStatus(Status.PREPARE);
        System.out.println("Готовиться на кухне");
    }

    @Override
    public void serve() {
        setStatus(Status.SOLD);
        System.out.println("Подаём к столу");
    }
}

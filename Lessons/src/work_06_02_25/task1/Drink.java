package work_06_02_25.task1;

public class Drink extends MenuItem{

    public Drink(String name, double price) {
        super(name, price);
    }

    @Override
    public void prepare() {
        setStatus(Status.PREPARE);
        System.out.println("Смешивают из ингредиентов");
    }

    @Override
    public void serve() {
        setStatus(Status.SOLD);
        System.out.println("Подаём к столу");
    }
}

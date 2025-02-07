package work_06_02_25;

public class Rabbit extends Animal {
    public Rabbit(int size, Type type) {
        super(size, type);
    }

    @Override
    public void makeSound() {
        System.out.println("Хрум хрум");
    }
}

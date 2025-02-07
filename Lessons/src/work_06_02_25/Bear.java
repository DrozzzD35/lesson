package work_06_02_25;

public class Bear extends Animal {
    public Bear(int size, Type type) {
        super(size, type);
    }

    @Override
    public void makeSound() {
        System.out.println("Рык");
    }
}

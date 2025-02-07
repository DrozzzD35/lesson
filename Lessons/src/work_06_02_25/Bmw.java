package work_06_02_25;

public class Bmw extends Car{

    public Bmw(String color, String mark, int speed) {
        super(color, mark, speed);
    }

    @Override
    public void makeSound() {
        System.out.println("Бип-бип");
    }
}

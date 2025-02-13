package work_06_02_25.Lesson;

public class Mers extends Car{
    public Mers(String color, String mark, int speed) {
        super(color, mark, speed);
    }

    @Override
    public void makeSound() {
        System.out.println("Бооооп-боп");
    }
}

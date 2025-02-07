package work_06_02_25;

public abstract class Car {

    protected String color;
    protected String mark;
    protected int speed;

    public Car(String color, String mark, int speed) {
        this.color = color;
        this.mark = mark;
        this.speed = speed;
    }

    public abstract void makeSound();

    public void move(){
        System.out.println("Люблю ездить по дороге");
    }

}

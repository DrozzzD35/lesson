package HomeWork_24_12_24.work4;

public class Hamster {
    public String name;
    public int age;
    public double weight;
    public String color;

    public void eat(int foodValue) {
        this.weight += foodValue;
    }
}
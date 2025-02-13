package work_06_02_25.task2;

public abstract class Animal {

    protected int size;
    protected Type type;

    public Animal(int size, Type type) {
        this.size = size;
        this.type = type;
    }

    public abstract void makeSound();

    public  void eat(){
        System.out.println("Люблю кушать");
    }
}

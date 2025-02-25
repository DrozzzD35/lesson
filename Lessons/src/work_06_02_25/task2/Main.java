package work_06_02_25.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal rabbit = new Rabbit(15, Type.home);
        Animal bear = new Bear(50,Type.wild);
        rabbit.makeSound();
        bear.makeSound();
        rabbit.eat();

        List<String> names = new ArrayList<>();
        List<Animal> animals = List.of(bear, rabbit);
        getLoveAnimal(animals);
    }

    public static Animal getLoveAnimal(List<Animal> animals){
        return animals.get(0);
    }

}

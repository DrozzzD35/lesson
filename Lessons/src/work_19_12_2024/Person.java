package work_19_12_2024;

public class Person {
    String name;
    int age;

    public Person(String newName, int newAge) {
        name = newName;
        age = newAge;
    }

    void sayHello() {
        System.out.println("Привет. Меня зовут " + name + ". Мне " + age + " лет.");
    }

}

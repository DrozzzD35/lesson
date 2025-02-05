package work_19_12_2024;

public class Student {

    String name;
    int age;

    Student(String newName, int newAge) {
        name = newName;
        age = newAge;
    }

    void study() {
        System.out.println("Меня зовут: " + name + ", мне " + age + " и пошел на учебу.");
    }

}

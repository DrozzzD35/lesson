package homeWork_24_12_24.work2;


//Хотим знать о хомяке больше: добавьте информацию о нём — возраст (англ. age), вес (англ. weight) и цвет (англ. color).
public class Work2 {

    void main(String[] args) {
        Hamster homka = new Hamster("Хомка",8,12,"бурый");

        System.out.println("Имя: " + homka.name);
        System.out.println("Возраст: " + homka.age);
        System.out.println("Вес: " + homka.weight);
        System.out.println("Цвет: " + homka.color);
    }
}

class Hamster {
    String name;
    int age;
    int weight;
    String color;

    Hamster(String newName, int newAge, int newWeight, String NewColor) {
        name = newName;
        age = newAge;
        weight = newWeight;
        color = NewColor;
    }
}

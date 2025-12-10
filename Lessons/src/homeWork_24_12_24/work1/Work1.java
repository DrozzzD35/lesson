package homeWork_24_12_24.work1;


//Программа не работает — мы пытаемся обратиться к объекту, но он ещё не создан. Исправьте это.
public class Work1 {
    public void main(String[] args) {
        Hamster homka = new Hamster("Хомка");


        System.out.println("Имя: " + homka.name);
    }
}


class Hamster {
    String name;

    Hamster(String newName) {
        name = newName;
    }
}


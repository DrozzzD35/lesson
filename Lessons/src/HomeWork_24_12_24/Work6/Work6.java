package HomeWork_24_12_24.Work6;

// Из-за того что мы добавили в класс Hamster конструктор с параметрами,
// код из предыдущего урока перестал работать. Перепишите его.
public class Work6 {

    public static void main(String[] args) {
        Hamster bite = new Hamster("Байт",2,350, "Рыжий");
        Hamster ninja = new Hamster("Ниндзя", 1,250,"Белый");
        Hamster kuzya = new Hamster("Кузя",3,350,"Пятнистый");
        Hamster paskal = new Hamster("Паскаль", 2,320,"Черный");

        System.out.println(bite.name);
        System.out.println(ninja.name);
        System.out.println(kuzya.name);
        System.out.println(paskal.name);
    }
}

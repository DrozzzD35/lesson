package homeWork_25_01_25.task4;

public class Main {
    public static void main(String[] args) {
        Book house = new Book("Дом", "Альберт", 500, Genre.COMEDY);
        Book forest = new Book("Лес", "Генри", 800, Genre.ROMANCE);
        Book car = new Book("Машина", "Роберт", 700, Genre.DRAMA);

        Library library = new Library();
        library.addBook(house);
        library.addBook(forest);
        library.addBook(car);

        System.out.println("До удаления");

        library.printAllBooks();

        library.removeBook(car);
        System.out.println("После удаления");

        library.printAllBooks();

        int totalBooksCreated = Book.getTotalBooksCreated();
        System.out.println("Общее количество созданных книг " + totalBooksCreated);
        test();

    }

    public static void test() {
        Genre comedy = Genre.COMEDY;

        System.out.println(comedy.getCount());
        System.out.println(comedy.getCount());
        System.out.println(comedy.getCount());
        System.out.println(comedy.getCount());

        System.out.println(comedy.getName());
    }
}

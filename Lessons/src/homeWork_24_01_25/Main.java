package homeWork_24_01_25;

public class Main {
    public static void main(String[] args) {
        Book house = new Book("Дом", "Альберт", -500);
        Book forest = new Book("Лес", "Генри", 800);
        Book car = new Book("Машина", "Роберт", 700);

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
    }
}

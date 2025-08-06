package homeWork_06_08_2025;

public class Main {
    public static void main(String[] args) {
        Library book = new Book("Хроники", "Харуки");
        Library journal = new Journal("Морской", 2024);
        Library dvd = new DVD("Хлебушек", 2018);

        book.shortTime();
        journal.shortTime();
        dvd.shortTime();
        System.out.println();

        book.averageTime();
        journal.averageTime();
        dvd.averageTime();
        System.out.println();

        book.longTime();
        journal.longTime();
        dvd.longTime();

    }
}

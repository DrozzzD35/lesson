package homeWork_06_08_2025;

public class Book implements Library {
    private String nameBook;
    private String authorOfBook;

    public Book(String nameBook, String authorOfBook) {
        this.nameBook = nameBook;
        this.authorOfBook = authorOfBook;
    }

    @Override
    public void shortTime() {
        System.out.println("Книга " + nameBook + " автора " + authorOfBook + " выдаётся на 7 дней");
    }

    @Override
    public void averageTime() {
        System.out.println("Книга " + nameBook + " автора " + authorOfBook + " выдаётся на 12 дней");


    }

    @Override
    public void longTime() {
        System.out.println("Книга " + nameBook + " автора " + authorOfBook + " выдаётся на 18 дней");


    }
}

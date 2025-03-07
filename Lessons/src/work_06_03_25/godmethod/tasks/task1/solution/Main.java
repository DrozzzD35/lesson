package work_06_03_25.godmethod.tasks.task1.solution;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();
        Book book = new Book();


//        Book book1 = new Book("978-3-16-148410-0", "Мастер и Маргарита", "М.А. Булгаков");
//        Book book2 = new Book("978-0-261-10236-2", "Властелин колец", "Дж. Р. Р. Толкин");
//        library.addBook(book1);
//        library.addBook(book2);

        library.addBook(new Book("978-3-16-148410-0", "Мастер и Маргарита", "М.А. Булгаков"));
        library.addBook(new Book("978-0-261-10236-2", "Властелин колец", "Дж. Р. Р. Толкин"));

        library.addOutBook("Мастер и Маргарита");
        library.printBooksLibrary();
        library.addBookList("Мастер и Маргарита");
        library.printAllBooks();


    }
}

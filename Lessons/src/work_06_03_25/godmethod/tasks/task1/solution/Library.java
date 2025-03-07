package work_06_03_25.godmethod.tasks.task1.solution;


import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<Book> checkedOutBooks = new ArrayList<>();


    public void addBook(Book book) {
        books.add(book);
    }

    public Book findBook(String name) {
        Book bookToCheckout = null;
        for (Book b : books) {
            if (b.getTitle().equals(name)) {
                bookToCheckout = b;
                return bookToCheckout;
            }
        }
        return null;
    }

    public void addOutBook(String name) {
        Book book = findBook(name);
        if (book != null) {
            books.remove(book);
            checkedOutBooks.add(book);
            System.out.println("Книга «" + book.getTitle() + "» выдана.");
        }
        System.out.println();
    }

    public void printBooksLibrary() {
        System.out.println("=== Каталог доступных книг ===");
        for (Book b : books) {
            System.out.println(b.getTitle() + " | Автор: " + b.getAuthor() + " | ISBN: " + b.getIsbn());
        }
        System.out.println();
    }

    public Book findOutBook(String name) {
        Book bookToReturn;
        for (Book b : checkedOutBooks) {
            if (b.getTitle().equals(name)) {
                bookToReturn = b;
                return bookToReturn;
            }
        }
        return null;
    }

    public void addBookList(String name){
        Book book = findOutBook(name);
        if (book != null) {
            checkedOutBooks.remove(book);
            books.add(book);
            System.out.println("Книга «" + book.getTitle() + "» возвращена в библиотеку.");
        }
        System.out.println();
    }

    public void printAllBooks() {
        System.out.println("=== Полный список (все книги, в библиотеке + выданные) ===");
        List<Book> allBooks = new ArrayList<>(books);
        allBooks.addAll(checkedOutBooks);
        for (Book b : allBooks) {
            System.out.println(b.getTitle() + " (" + b.getAuthor() + ")");
        }
        System.out.println();
    }


}

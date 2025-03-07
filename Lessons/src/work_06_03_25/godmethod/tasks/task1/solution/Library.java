package work_06_03_25.godmethod.tasks.task1.solution;


import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<Book> checkedOutBooks = new ArrayList<>();


    public void addBook(Book book) {
        books.add(book);
    }

    public Book findBook(Book bookToCheckout) {
        for (Book b : books) {
            if (b.getTitle().equals("Мастер и Маргарита")) {
                bookToCheckout = b;
                return bookToCheckout;
            }
        }
        return null;
    }

    public void addOutBook(Book bookToCheckout) {
        Book book = findBook(bookToCheckout);
        if (book != null) {
            books.remove(bookToCheckout);
            checkedOutBooks.add(bookToCheckout);
            System.out.println("Книга «" + bookToCheckout.getTitle() + "» выдана.");
        }
    }

    public void printBooksLibrary() {
        System.out.println("=== Каталог доступных книг ===");
        for (Book b : books) {
            System.out.println(b.getTitle() + " | Автор: " + b.getAuthor() + " | ISBN: " + b.getIsbn());
        }
    }

    public Book findOutBook(Book bookToReturn) {
        for (Book b : checkedOutBooks) {
            if (b.getTitle().equals("Мастер и Маргарита")) {
                bookToReturn = b;
                return bookToReturn;
            }
        }
        return null;
    }

    public void addBookList(Book bookToReturn){
        Book book = findOutBook(bookToReturn);
        if (book != null) {
            checkedOutBooks.remove(book);
            books.add(book);
            System.out.println("Книга «" + book.getTitle() + "» возвращена в библиотеку.");
        }
    }

    public void printAllBooks() {
        System.out.println("=== Полный список (все книги, в библиотеке + выданные) ===");
        List<Book> allBooks = new ArrayList<>(books);
        allBooks.addAll(checkedOutBooks);
        for (Book b : allBooks) {
            System.out.println(b.getTitle() + " (" + b.getAuthor() + ")");
        }
    }


}

package work_06_03_25.godmethod.tasks.task1;

import java.util.ArrayList;
import java.util.List;

public class LibraryGodMethod {
    public static void main(String[] args) {

        //Создаём список книг в библиотеке
        List<Book> books = new ArrayList<>();

        //Добавляем список книг
        books.add(new Book("978-3-16-148410-0", "Мастер и Маргарита", "М.А. Булгаков"));
        books.add(new Book("978-0-261-10236-2", "Властелин колец", "Дж. Р. Р. Толкин"));

        //Создаём список книг на выдачу
        List<Book> checkedOutBooks = new ArrayList<>();

        //Поиск книг в библиотеке
        Book bookToCheckout = null;
        for (Book b : books) {
            if (b.getTitle().equals("Мастер и Маргарита")) {
                bookToCheckout = b;
                break;
            }
        }

        //Переход книги из библиотеки в выданные
        if (bookToCheckout != null) {
            books.remove(bookToCheckout);
            checkedOutBooks.add(bookToCheckout);
            System.out.println("Книга «" + bookToCheckout.getTitle() + "» выдана.");
        }

        //Запись доступных книг
        System.out.println("=== Каталог доступных книг ===");
        for (Book b : books) {
            System.out.println(b.getTitle() + " | Автор: " + b.getAuthor() + " | ISBN: " + b.getIsbn());
        }

        //Поиск книг среди выданных
        Book bookToReturn = null;
        for (Book b : checkedOutBooks) {
            if (b.getTitle().equals("Мастер и Маргарита")) {
                bookToReturn = b;
                break;
            }
        }

        //Переход книги из выданные в библиотеку
        if (bookToReturn != null) {
            checkedOutBooks.remove(bookToReturn);
            books.add(bookToReturn);
            System.out.println("Книга «" + bookToReturn.getTitle() + "» возвращена в библиотеку.");
        }

        //Запись всех книг
        System.out.println("=== Полный список (все книги, в библиотеке + выданные) ===");
        List<Book> allBooks = new ArrayList<>(books);
        allBooks.addAll(checkedOutBooks);
        for (Book b : allBooks) {
            System.out.println(b.getTitle() + " (" + b.getAuthor() + ")");
        }
    }
}

class Book {
    private String isbn;
    private String title;
    private String author;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
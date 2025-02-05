package homeWork_25_01_25.task4;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();


    public void addBook(Book book) {
        if (book.checkBook()) {
            books.add(book);
        }
    }

    public void removeBook(Book book) {
        if (book.checkBook()) {
            books.remove(book);
        }
    }

    public void printAllBooks() {
        for (Book book : books) {
            book.printBookInfo();
        }
    }


}


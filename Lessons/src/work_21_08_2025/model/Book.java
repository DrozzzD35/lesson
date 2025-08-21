package work_21_08_2025.model;

public class Book extends LibraryItem {
    private String author;
    private int isbn;

    public Book(String id, String title, boolean isAvailable, String author, int isbn) {
        super(id, title, isAvailable);
        this.author = author;
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public int getIsbn() {
        return isbn;
    }

    @Override
    public String getItemType() {
        return "Книга";
    }

    @Override
    public String toString() {
        return "Книга{" + "рейтинг=" + isbn + ", идентификатор='" + id + '\'' + ", название='" + title + '\'' + ", наличие=" + isAvailable + ", автор='" + author + '\'' + '}';
    }
}

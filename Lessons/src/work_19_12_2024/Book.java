package work_19_12_2024;

public class Book {
    int pages;
    String author;
    String title;

    void printInfo() {
        System.out.println("Название " + title + "Автор " + author + "Количество страниц " + pages);
    }

    Book(String newAuthor, String newTitle, int newPages) {
        pages = newPages;
        author = newAuthor;
        title = newTitle;
    }
}

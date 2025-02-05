package homeWork_24_01_25;

public class Book {
    private String tittle;
    private String author;
    private int price;
    private static int totalBooksCreated = 0;

    public Book(String tittle, String author, int price) {
        this.tittle = tittle;
        this.author = author;
        this.price = price;

        if(checkBook()){
            totalBooksCreated++;
        }
    }

    public static int getTotalBooksCreated() {
        return totalBooksCreated;
    }

    public void printBookInfo() {
        System.out.println("Название книги " + tittle);
        System.out.println("Имя автора " + author);
        System.out.println("Цена книги " + price);
        System.out.println();
    }

    public boolean checkBook() {

        if (tittle.isEmpty()) {
            System.out.println("Название не может быть пустым");
            return false;
        }

        if (author.isEmpty()) {
            System.out.println("Имя автора не может быть пустым");
            return false;
        }

        if (price <= 0) {
            System.out.println("Цена не может быть отрицательной");
            return false;
        }

        return true;
    }
}

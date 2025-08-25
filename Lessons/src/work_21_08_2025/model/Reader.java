package work_21_08_2025.model;

import work_21_08_2025.Exception.ItemAlreadyReturnedException;

import java.util.List;

public class Reader {
    private String name;
    private int readerId;
    private List<LibraryItem> borrowItems;

    public Reader(String name, int readerId, List<LibraryItem> borrowItems) {
        this.name = name;
        this.readerId = readerId;
        this.borrowItems = borrowItems;
    }

    public void borrowItem(LibraryItem item) {
        borrowItems.add(item);
    }

    public void returnItem(LibraryItem item) {
        if (!borrowItems.contains(item)) {
            throw new ItemAlreadyReturnedException("Предмет вернули " + item);
        }
        borrowItems.remove(item);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReaderId() {
        return readerId;
    }

    public void setReaderId(int readerId) {
        this.readerId = readerId;
    }

    public List<LibraryItem> getBorrowItems() {
        return borrowItems;
    }

    public void setBorrowItems(List<LibraryItem> borrowItems) {
        this.borrowItems = borrowItems;
    }

    @Override
    public String toString() {
        return "Читатель{" +
                "имя='" + name + '\'' +
                ", идентификатор читателя=" + readerId +
                ", список книг читателя=" + borrowItems +
                '}';
    }
}

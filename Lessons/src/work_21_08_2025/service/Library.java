package work_21_08_2025.service;

import work_21_08_2025.Exception.ItemAlreadyReturnedException;
import work_21_08_2025.Exception.ItemNotAvailableException;
import work_21_08_2025.Exception.ItemNotFoundException;
import work_21_08_2025.Exception.ReaderNotFoundException;
import work_21_08_2025.model.LibraryItem;
import work_21_08_2025.model.Reader;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, LibraryItem> items;
    private Map<Integer, Reader> readers;

    public Library() {
        this.items = new HashMap<>();
        this.readers = new HashMap<>();
    }

    public void addReader(Reader reader) {
        readers.put(reader.getReaderId(), reader);
        System.out.println("Добавлен читатель " + reader);
    }

    public Reader findReaderById(int readerId) {
        if (!readers.containsKey(readerId)) {
            throw new ReaderNotFoundException("Читатель с таким идентификатором не найден " + readerId);
        }
        return readers.get(readerId);
    }


    public void addItem(LibraryItem item) {
        items.put(item.getId(), item);
        System.out.println("Добавлен " + item);
    }

    public void borrowItem(String id, int readerId) {
        Reader reader = findReaderById(readerId);
        LibraryItem item = findItemById(id);
        if (!item.isAvailable()) {
            throw new ItemNotAvailableException("Предмет с таким идентификатором недоступен " + id);
        }
        reader.borrowItem(item);
        item.setAvailable(false);
        System.out.println("Предмет выдан. Идентификатор " + id + " , название " + item.getTitle());

    }

    public void returnItem(String id, int readerId) {
        Reader reader = findReaderById(readerId);
        LibraryItem item = findItemById(id);
        if (item.isAvailable()) {
            throw new ItemAlreadyReturnedException("Предмет уже возвращён " + id);
        }
        reader.returnItem(item);
        item.setAvailable(true);
        System.out.println("Предмет возвращён " + id);
    }


    // Вспомогательные

    private LibraryItem findItemById(String id) {
        if (items.containsKey(id)) {
            return items.get(id);
        }
        throw new ItemNotFoundException("Предмет с таким идентификатором не найден " + id);
    }

}

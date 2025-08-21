package work_21_08_2025.service;

import work_21_08_2025.Exception.ItemAlreadyReturnedException;
import work_21_08_2025.Exception.ItemNotAvailableException;
import work_21_08_2025.Exception.ItemNotFoundException;
import work_21_08_2025.model.LibraryItem;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, LibraryItem> items;

    public Library() {
        this.items = new HashMap<>();
    }

    public void addItem(LibraryItem item) {
        items.put(item.getId(), item);
        System.out.println("Добавлен " + item);
    }

    public LibraryItem findItemById(String id) {
        if (items.containsKey(id)) {
            return items.get(id);
        }
        throw new ItemNotFoundException("Предмет с таким идентификатором не найден " + id);
    }

    public LibraryItem borrowItem(String id) {
        LibraryItem item = findItemById(id);
        if (!item.isAvailable()) {
            throw new ItemNotAvailableException("Предмет с таким идентификатором недоступен " + id);
        }
        item.setAvailable(false);
        System.out.println("Предмет выдан. Идентификатор " + id + " , название " + item.getTitle());
        return item;
    }

    public void returnItem(String id){
        LibraryItem item = findItemById(id);
        if (item.isAvailable()){
            throw new ItemAlreadyReturnedException("Предмет уже возвращён " + id);
        }
        item.setAvailable(true);
        System.out.println("Предмет возвращён " + id);
    }





}

package homeWork_25_01_25.task10;

import homeWork_25_01_25.task9.Rectangle;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RestaurantOrder {
    private int tableNumber;
    private List<MenuItem> items = new ArrayList<>();

    public RestaurantOrder(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public void removeItem(MenuItem item) {
        items.remove(item);
    }

    public int calculateTotal() {
        int sumPrice = 0;
        for (MenuItem item : items) {
            sumPrice += item.getPrice();
        }
        return sumPrice;

    }

    public void printOrder() {
        System.out.println("Столик № " + tableNumber);
        for (MenuItem item : items) {
            if (item.checkItem()) {
                System.out.print("Название блюда: " + item.getName());
                System.out.print("  Цена: " + item.getPrice());
                System.out.println("  Категория: " + item.getCategory().getName());
            }

        }
        System.out.println("Сумма заказа: " + calculateTotal());
        System.out.println("Количество позиций заказа: " + items.size());
        System.out.println("=======================================");
    }
}
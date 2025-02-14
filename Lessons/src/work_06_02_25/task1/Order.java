package work_06_02_25.task1;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<MenuItem> menuItems = new ArrayList<>();

    public void addItem(MenuItem item) {
        menuItems.add(item);
    }

    public void removeItem(MenuItem item) {
        menuItems.remove(item);
    }

    public void advancedAllStatus() {

    }

    public double getTotalPrice() {
        double sumPrice = 0;
        for (MenuItem item : menuItems) {
            sumPrice += item.getPrice();
            return sumPrice;
        }
        return sumPrice;
    }
}

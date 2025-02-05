package homeWork_25_01_25.task10;

import homeWork_25_01_25.task9.Rectangle;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MenuItem lambKebab = new MenuItem("Шашлык из баранины", 160, Category.MAIN);
        MenuItem porkKebab = new MenuItem("Шашлык из свинины", 155, Category.MAIN);
        MenuItem tiramisu = new MenuItem("Тирамису", 120, Category.DESSERT);
        MenuItem medovik = new MenuItem("Медовик", 80, Category.DESSERT);
        MenuItem tea = new MenuItem("Чай", 30, Category.DRINK);
        MenuItem coffee = new MenuItem("Кофе", 50, Category.DRINK);

        Map<Integer, List<MenuItem>> tablesMap = new HashMap<>();
        tablesMap.put(1, List.of(coffee, porkKebab, medovik));
        tablesMap.put(2, List.of(tiramisu, lambKebab));
        tablesMap.put(3, List.of(tea, porkKebab));


        for (Map.Entry<Integer, List<MenuItem>> entry:tablesMap.entrySet()){
            RestaurantOrder restaurantOrder = new RestaurantOrder(entry.getKey());
            for (MenuItem item:entry.getValue()){
                restaurantOrder.addItem(item);
            }
            restaurantOrder.printOrder();
        }

    }
}

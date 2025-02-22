package work_21_02_2025.task1;

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
        for (MenuItem item : menuItems) {
/*            if (item.status == Status.ORDER) {
//                if(item instanceof Dish){
//                    Kitchen.prepareDish((Dish) item);
//                } else if (item instanceof Drink) {
//                    Bar.serveDrink((Drink) item);
//                }
                item.prepare();
            } else if (item.status == Status.PREPARE) {
                item.serve();
            } else {
                System.out.println("Блюдо подано " +item.getName());
            }
            */

            switch (item.status) {
                case ORDER -> item.prepare();
                case PREPARE -> item.serve();
                case SOLD -> System.out.println("Блюдо подано " +item.getName());
                default -> System.out.println( "Непонятный статус");
            }

        }
    }

    public double getTotalPrice() {
        double sumPrice = 0;
        for (MenuItem item : menuItems) {
            sumPrice += item.getPrice();
        }
        return sumPrice;
    }
}

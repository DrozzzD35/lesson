package work_21_02_2025.task1;

public class Main {
    public static void main(String[] args) {
        MenuItem drink1 = new Drink("Сок", 200);
        MenuItem drink2 = new Drink("Компот", 150);
        MenuItem drink3 = new Drink("Лемонад", 300);

        MenuItem dish1 = new Dish("Макароны", 350);
        MenuItem dish2 = new Dish("Свинина", 700);
        MenuItem dish3 = new Dish("Котлеты", 500);

        Order order = new Order();

        order.addItem(drink1);
        order.addItem(drink2);
        order.addItem(drink3);

        order.addItem(dish1);
        order.addItem(dish2);
        order.addItem(dish3);

        order.advancedAllStatus();
        order.advancedAllStatus();

        double price = order.getTotalPrice();
        System.out.println("Сумма за заказа " + price);
    }
}

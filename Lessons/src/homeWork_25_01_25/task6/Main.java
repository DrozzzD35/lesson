package homeWork_25_01_25.task6;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        Order chair = new Order("Стул", 50.8);
        Order bed = new Order("", 75.4);
        Order table = new Order("Стол", -24.6);
        Order phone = new Order();
        phone.setAmount(320.15);
        phone.setCustomerName("Телефон");

        order.addOrders(chair);
        order.addOrders(bed);
        order.addOrders(table);
        order.addOrders(phone);

        order.printAllOrders();
    }
}

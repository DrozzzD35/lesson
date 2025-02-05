package homeWork_25_01_25.task6;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Order {
    private String customerName;
    UUID orderld;
    private double amount;
    List<Order> orders = new ArrayList<>();

    public void addOrders(Order order) {
        orders.add(order);
    }

    public Order() {
    }

    public Order(String customerName, double amount) {
        if (customerName.isEmpty()) {
            System.out.println("Имя заказа не может быть пустым");
            return;
        }
        this.customerName = customerName;
        if (amount <= 0) {
            System.out.println("Сумма заказа " + customerName + " не может быть отрицательной");
            System.out.println();
            return;
        }
        this.amount = amount;
        this.orderld = UUID.randomUUID();
    }

    public double getAmount() {
        return amount;
    }

    static double calculateTotalPriceWithTax(double amount) {
        return amount + (amount * 0.2);
    }

    public void setAmount(double amount) {
        if (amount <= 0) {
            System.out.println("Сумма заказа " + customerName + " не может быть отрицательной");
            System.out.println();
            return;
        }
        this.amount = amount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        if (customerName.isEmpty()) {
            System.out.println("Имя не может быть пустым");
            System.out.println();
            return;
        }
        this.customerName = customerName;
        this.orderld = UUID.randomUUID();
    }

    public void printAllOrders() {
        for (Order order : orders) {
            if (order.customerName == null || order.amount == 0) {
                continue;
            } else {
                System.out.println("Название заказа: " + order.customerName);
                System.out.println("Стоимость заказа: " + calculateTotalPriceWithTax(order.amount));
                System.out.println("Серийный номер заказа: " + order.orderld);
                System.out.println();
            }
        }
    }
}

package work_06_03_25.godmethod.tasks.task2.solution;


import java.util.ArrayList;
import java.util.List;

public class OrderService {
    private List<Order> orders = new ArrayList<>();

    public void addOrders(Order order) {
        orders.add(order);
    }

    public Order findOrderById(int orderId) {
        for (Order order : orders) {
            if (order.getOrderId() == orderId) {
                return order;
            }
        }
        return null;
    }

    public void updateOrderStatus(int orderId, String newStatus) {
        Order order = findOrderById(orderId);
        if (order != null) {
            order.setStatus(newStatus);
        }
    }

    public void printAll(){
        System.out.println("All orders:");
        for (Order order : orders) {
            System.out.println("Order " + order.getOrderId() + ", status = " + order.getStatus());
        }
        System.out.println();
    }

}

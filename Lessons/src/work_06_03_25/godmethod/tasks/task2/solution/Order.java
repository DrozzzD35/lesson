package work_06_03_25.godmethod.tasks.task2.solution;

import java.util.List;

public class Order {
    private int orderId;
    private List<String> items;
    private String status;

    public Order(int orderId, List<String> items, String status) {
        this.orderId = orderId;
        this.items = items;
        this.status = status;
    }

    public int getOrderId() {
        return orderId;
    }

    public List<String> getItems() {
        return items;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

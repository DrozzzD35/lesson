package work_06_03_25.godmethod.tasks.task2.solution;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor();
        UserService userService = new UserService();
        OrderService orderService = new OrderService();

        processor.fillArray(10);
        processor.printMaxMinAverageArray();

        userService.addUser(new User(1, "Alice"));
        userService.addUser(new User(2, "Bob"));
        userService.addUser(new User(3, "Charlie"));

        userService.removeUserById(2);
        userService.printFoundUsers("li");
        userService.updateUserName(3, "CharlieUpdated");
        userService.printUsers();


        orderService.addOrders(new Order(101, List.of("ItemA", "ItemB"), "NEW"));
        orderService.addOrders(new Order(102, List.of("ItemC"), "IN_PROGRESS"));

        orderService.printAll();
        orderService.updateOrderStatus(101, "COMPLETED");
        orderService.printAll();

    }
}

package work_06_03_25.godmethod.tasks.task2.solution;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bussiness bussiness = new Bussiness();

        bussiness.fillNumbers();
        bussiness.findMinMaxAverage();
        bussiness.printArray();
//        User user1 = new User(1, "Alice");
//        User user2 = new User(2, "Bob");
//        User user3 = new User(3, "Charlie");
//        bussiness.addUsers(user1);
//        bussiness.addUsers(user2);
//        bussiness.addUsers(user3);
        bussiness.addUsers(new User(1, "Alice"));
        bussiness.addUsers(new User(2, "Bob"));
        bussiness.addUsers(new User(3, "Charlie"));
        bussiness.removeUserFromList(2);
        bussiness.addFoundUsers("li");
        bussiness.changeNameUsers(3, "CharlieUpdated");
        bussiness.printUsers();
        bussiness.printFoundUsers("li");//возникла сложность как из сигнатуры метода addFoundUsers сохранить значение "li"

        Order order1 = new Order(101, List.of("ItemA", "ItemB"), "NEW");
        Order order2 = new Order(102, List.of("ItemC"), "IN_PROGRESS");
        bussiness.addOrders(order1);
        bussiness.addOrders(order2);

        bussiness.printFindOrderUsers(102);
        bussiness.changeStatusOrders(101, "COMPLETED");

        bussiness.fillFilteredOrders();
        bussiness.printOrders();
        bussiness.printFilteredOrders();


    }
}

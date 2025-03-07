package work_06_03_25.godmethod.tasks.task2.solution;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bussiness {
    private int size = 10;
    private int[] numbers;
    private Random random;
    private int max;
    private int min;
    private double sum;
    private double average;
    private List<User> users = new ArrayList<>();
//    private String substringToFind;
    private List<User> foundUsers = new ArrayList<>();
    private List<Order> orders = new ArrayList<>();
    private String filterStatus = "NEW";
    private List<Order> filteredOrders = new ArrayList<>();


    public void fillNumbers() {
        numbers = new int[size];
        random = new Random();
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }
    }

    public void findMinMaxAverage() {
        max = numbers[0];
        min = numbers[0];
        sum = 0;
        for (int i = 0; i < size; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
            sum += numbers[i];
        }
        average = sum / size;
    }

    public void printArray() {
        System.out.print("Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + average);
        System.out.println();
    }

    public void addUsers(User user) {
        users.add(user);
    }

    public void removeUserFromList(int idToRemove) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == idToRemove) {
                users.remove(i);
                break;
            }
        }
    }

    public void addFoundUsers(String substringToFind) {
        for (User user : users) {
            if (user.getName().contains(substringToFind )) {
                foundUsers.add(user);
            }
        }
    }

    public void changeNameUsers(int idToUpdate, String newName) {
        for (User user : users) {
            if (user.getId() == idToUpdate) {
                user.setName(newName);
                break;
            }
        }
    }

    public void printUsers() {
        System.out.println("All users:");
        for (User user : users) {
            System.out.println("ID: " + user.getId() + ", Name: " + user.getName());
        }
        System.out.println();
    }

    public void printFoundUsers(String substringToFind) {
        System.out.println("Users found by substring '" + substringToFind + "':");
        for (User user : foundUsers) {
            System.out.println("ID: " + user.getId() + ", Name: " + user.getName());
        }
        System.out.println();
    }

    public void addOrders(Order order) {
        orders.add(order);
    }

    public Order getOrderUsers(int orderIdToFind) {
        Order foundOrder = null;
        for (Order order : orders) {
            if (order.getOrderId() == orderIdToFind) {
                return foundOrder = order;
            }
        }
        return null;
    }


    public void printFindOrderUsers(int orderIdToFind) {
        Order order = getOrderUsers(orderIdToFind);
        if (order != null) {
            System.out.println("Found order with ID " + order.getOrderId() + ", status = " + order.getStatus());
        }
        System.out.println();
    }

    public void changeStatusOrders(int orderIdToUpdate, String newStatus) {
        for (Order order : orders) {
            if (order.getOrderId() == orderIdToUpdate) {
                order.setStatus(newStatus);
                break;
            }
        }
    }


    public void fillFilteredOrders() {
        for (Order order : orders) {
            if (order.getStatus().equals(filterStatus)) {
                filteredOrders.add(order);
            }
        }
    }

    public void printOrders() {
        System.out.println("All orders:");
        for (Order order : orders) {
            System.out.println("Order " + order.getOrderId() + ", status = " + order.getStatus());
        }
        System.out.println();
    }

    public void printFilteredOrders() {
        System.out.println("Filtered orders with status '" + filterStatus + "':");
        for (Order order : filteredOrders) {
            System.out.println("Order " + order.getOrderId() + ", status = " + order.getStatus());
        }
        System.out.println();
    }

}

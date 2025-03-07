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
    private String substringToFind;
    private List<User> foundUsers = new ArrayList<>();
    private List<Order> orders = new ArrayList<>();


    public void fillNumbers() {
        numbers = new int[size];
        random = new Random();
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }
    }

    public void findMinMaxAverage() {
        min = numbers[0]; //Эта строка - личная доработка, иначе min = 0 (всегда)
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
    }

    public void addUsers(User user) {
        users.add(user);
    }

    public void removeObjectUsers(int idToRemove) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == idToRemove) {
                users.remove(i);
                break;
            }
        }
    }

    public void addFoundUsers() {
        for (User user : users) {
            if (user.getName().contains(substringToFind)) {
                foundUsers.add(user);
            }
        }
    }

    public void getNameObjectUsers(int idToUpdate, String newName) {
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
    }

    public void printFoundUsers() {
        System.out.println("Users found by substring '" + substringToFind + "':");
        for (User user : foundUsers) {
            System.out.println("ID: " + user.getId() + ", Name: " + user.getName());
        }
    }

    public void addOrders(Order order) {
        orders.add(order);
    }

    public Order findObjectUsers(Order faindOrder) {
        int orderIdToFind = 102;
        Order foundOrder = null;
        for (Order order : orders) {
            if (order.getOrderId() == orderIdToFind) {
                return foundOrder = order;
            }
        }
        return null;
    }

    public void printFindObjectUsers(Order foundOrder) {
        Order order = findObjectUsers(foundOrder);
        if (foundOrder != null) {
            System.out.println("Found order with ID " + foundOrder.getOrderId()
                    + ", status = " + foundOrder.getStatus());
        }
    }

    


}

package work_06_03_25.godmethod.tasks.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BigExample {
    public static void main(String[] args) {

        //Создание переменных
        int size = 10;
        int[] numbers = new int[size];
        Random random = new Random();

        //Присваиваем рандомные числа элементам массива numbers
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }

        //Создаём переменные
        int max = numbers[0];
        int min = numbers[0];
        double sum = 0;

        //Находим максимальное, минимальное и среднее значение
        for (int i = 0; i < size; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
            sum += numbers[i];
        }
        double average = sum / size;


        //Выписываем массив и его максимальное, минимальное и среднее значение в консоль
        System.out.print("Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + average);

        //Создали список
        List<User> users = new ArrayList<>();

        //Пополняем список
        users.add(new User(1, "Alice"));
        users.add(new User(2, "Bob"));
        users.add(new User(3, "Charlie"));

        //Находим id объекта списка users и удаляем
        int idToRemove = 2;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == idToRemove) {
                users.remove(i);
                break;
            }
        }


        //Создали переменную и список
        String substringToFind = "li";
        List<User> foundUsers = new ArrayList<>();

        //Заполняем список foundUsers
        for (User user : users) {
            if (user.getName().contains(substringToFind)) {
                foundUsers.add(user);
            }
        }

        //Именуем один из объектов списка users
        int idToUpdate = 3;
        String newName = "CharlieUpdated";
        for (User user : users) {
            if (user.getId() == idToUpdate) {
                user.setName(newName);
                break;
            }
        }

        //Выводим в консоль список users
        System.out.println("All users:");
        for (User user : users) {
            System.out.println("ID: " + user.getId() + ", Name: " + user.getName());
        }

        //Выводим в консоль список foundUsers
        System.out.println("Users found by substring '" + substringToFind + "':");
        for (User user : foundUsers) {
            System.out.println("ID: " + user.getId() + ", Name: " + user.getName());
        }

        //Создали список orders
        List<Order> orders = new ArrayList<>();

        //Создали объекты класса Order
        Order order1 = new Order(101, List.of("ItemA", "ItemB"), "NEW");
        Order order2 = new Order(102, List.of("ItemC"), "IN_PROGRESS");

        //Добавили объекты в список orders
        orders.add(order1);
        orders.add(order2);


        //Поиск объекта по id из списка orders
        int orderIdToFind = 102;
        Order foundOrder = null;
        for (Order order : orders) {
            if (order.getOrderId() == orderIdToFind) {
                foundOrder = order;
                break;
            }
        }

        //Выводим в консоль найденный элемент из списка order
        if (foundOrder != null) {
            System.out.println("Found order with ID " + foundOrder.getOrderId()
                    + ", status = " + foundOrder.getStatus());
        }

        //Изменение статуса объекта из списка orders
        int orderIdToUpdate = 101;
        String newStatus = "COMPLETED";
        for (Order order : orders) {
            if (order.getOrderId() == orderIdToUpdate) {
                order.setStatus(newStatus);
                break;
            }
        }

        //Создали переменную и список
        String filterStatus = "NEW";
        List<Order> filteredOrders = new ArrayList<>();

        //Заполнили новый список filteredOrders
        for (Order order : orders) {
            if (order.getStatus().equals(filterStatus)) {
                filteredOrders.add(order);
            }
        }

        //Выводим в консоль список orders
        System.out.println("All orders:");
        for (Order order : orders) {
            System.out.println("Order " + order.getOrderId() + ", status = " + order.getStatus());
        }

        //Выводим в консоль список filteredOrders
        System.out.println("Filtered orders with status '" + filterStatus + "':");
        for (Order order : filteredOrders) {
            System.out.println("Order " + order.getOrderId() + ", status = " + order.getStatus());
        }
    }
}

class User {
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Order {
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
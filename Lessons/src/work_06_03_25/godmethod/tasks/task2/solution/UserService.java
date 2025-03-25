package work_06_03_25.godmethod.tasks.task2.solution;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUserById(int id) {
        users.removeIf(user -> user.getId() == id);
    }


    public List<User> findUserByName(String substring) {
        List<User> foundUsers = new ArrayList<>();
        for (User user : users) {
            if (user.getName().contains(substring)) {
                foundUsers.add(user);
            }
        }
        return foundUsers;
    }

    public void printFoundUsers(String substring) {
        List<User> foundUsers = findUserByName(substring);
        System.out.println("Users found by substring '" + substring + "':");
        for (User user : foundUsers) {
            System.out.println("ID: " + user.getId() + ", Name: " + user.getName());
        }
        System.out.println();
    }

    public void updateUserName(int id, String newName) {
        for (User user : users) {
            if (user.getId() == id) {
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
}

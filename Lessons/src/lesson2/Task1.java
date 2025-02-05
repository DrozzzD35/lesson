package lesson2;

public class Task1 {

    public static void main() {
        int days = 10;
        int moneyPerDay = 200;
        int total = 0;
        for (int i = 1; i <= days; i++) {
            total += moneyPerDay;
            System.out.println("День " + i + ". " + "Уже: " + total);
        }

    }

}


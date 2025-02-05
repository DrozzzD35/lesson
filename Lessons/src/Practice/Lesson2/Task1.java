package Practice.Lesson2;

public class Task1 {
    public static void main(String[] args) {
        int days = 1;
        int money = 0;
        for (int i = days; i <= 5; i++) {
            money += 200;
            System.out.println("День " + i + ". Уже " + money + " руб.");
        }

    }
}

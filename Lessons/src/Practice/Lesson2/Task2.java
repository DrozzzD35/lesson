package Practice.Lesson2;

public class Task2 {
    public static void main(String[] args) {
        int days = 0;
        int money = 500;
        for (int i = money; i >= 0; i -= 100) {
            days += 3;
            money = i;
            System.out.println("На " + days + "-й день останется " + money + " рублей");

        }
        if (money == 0) {
            System.out.println("Денег хватит на " + days + " дней.");
        }

    }
}

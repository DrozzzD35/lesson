package lesson2;

public class Task2 {
    public static void main() {
        int days = 0;
        int money = 500;
        for (int i = money, x = days; i >= 0; i -= 100, x += 3) {
            if (x == 0) {
                continue;
            }
            System.out.println("На " + x + "-й день останется " + i + " рублей.");
            if (i == 0){
                    System.out.println("Денег хватит на " + x + " дней.");
                }
        }
    }
}


package homework_05_01_25.task9;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 21; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " число кратное 3 и 5.");// Решение должно быть в теле цикла
            } else if (i % 5 == 0) {
                System.out.println(i + " число кратное 5.");
            } else if (i % 3 == 0) {
                System.out.println(i + " число кратное 3.");
            } else {
                System.out.println(i);
            }
        }
    }

}

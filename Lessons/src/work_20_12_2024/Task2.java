package work_20_12_2024;

public class Task2 {
    public static void main() {

        int perimeter = perimeter(2, 4);
        System.out.println("Периметр квадрата " + perimeter);

        int area = area(5, 7);
        System.out.println("Площадь квадрата " + area);

    }

    public static int perimeter(int width, int height) {
        return (width + height) * 2;
    }

    public static int area(int width, int height) {
        return width * height;
    }
}

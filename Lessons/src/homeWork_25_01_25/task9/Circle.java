package homeWork_25_01_25.task9;

public class Circle {
    private double radius;
    private static int totalCircles = 0;

    public Circle(double radius) {
        this.radius = radius;
        totalCircles++;
    }

    public void getArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Радиус круга составляет: " + area);

    }


    void pringTotalCircles() {
        System.out.println("Всего круглых фигур создано: " + totalCircles);
    }


}

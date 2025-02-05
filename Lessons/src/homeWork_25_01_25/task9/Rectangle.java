package homeWork_25_01_25.task9;

public class Rectangle {
    private double width, height;
    private static int totalRectangles = 0;


    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        totalRectangles++;
    }

    public void getPerimeter() {
        double perimeter = (width + height) * 2;
        System.out.println("Периметр прямоугольной фигуры составляет: " + perimeter);

    }

    void pringTotalRectangles() {
        System.out.println("Всего прямоугольных фигур создано: " + totalRectangles);
    }


}

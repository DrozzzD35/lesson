package homeWork_25_01_25.task9;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(15);
        Circle circle1 = new Circle(17);
        Circle circle2 = new Circle(8);
        Circle circle3 = new Circle(10);
        Circle circle4 = new Circle(22);

        Rectangle rectangle = new Rectangle(4, 6);
        Rectangle rectangle1 = new Rectangle(1, 8);
        Rectangle rectangle2 = new Rectangle(18, 6);
        Rectangle rectangle3 = new Rectangle(4, 95);
        Rectangle rectangle4 = new Rectangle(5, 48);

        circle.getArea();
        circle1.getArea();
        circle2.getArea();
        circle3.getArea();
        circle4.getArea();
        System.out.println();
        circle.pringTotalCircles();
        System.out.println();

        rectangle.getPerimeter();
        rectangle1.getPerimeter();
        rectangle2.getPerimeter();
        rectangle3.getPerimeter();
        rectangle4.getPerimeter();
        System.out.println();
        rectangle.pringTotalRectangles();
    }
}

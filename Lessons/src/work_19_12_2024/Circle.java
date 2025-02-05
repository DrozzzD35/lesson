package work_19_12_2024;

public class Circle {
    double radius;

    void square() {
        System.out.println("Площадь круга равна " + Math.PI * radius * radius);
    }

    void perimeter() {
        System.out.println("Периметр круга равен " + Math.PI * (radius + radius));
    }

    Circle(double newRadius) {
        radius = newRadius;
    }

}

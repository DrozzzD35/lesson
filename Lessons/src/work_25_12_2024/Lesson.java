package work_25_12_2024;

import work_19_12_2024.Car;

public class Lesson {

    public static void main(String[] args) {
        /*
        * примитивный тим данных (int, double, float, boolean и т.д)
        * ссылочный тим данных (класс и интерфейсы)
        * */
        Car car = new Car("Тойота", "Тойота Камри", 2010, 0); // хранит ссылку на объект в памяти
        int number = 10; // хранит значение

        test1(number, car);

        System.out.println(number);
        car.printInfo();

    }

    public static void test1(int number, Car car){
        number = 15;
        System.out.println(number);

        car.year = 2000;
        car.printInfo();
    }

}

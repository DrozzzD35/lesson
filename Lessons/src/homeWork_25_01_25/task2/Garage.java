package homeWork_25_01_25.task2;

import java.util.ArrayList;

public class Garage {
    private ArrayList<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(Car car) {
        cars.remove(car);
    }

    public void printAllCars() {
        for (Car car : cars)
            car.printCars();
    }

}

package work_19_12_2024;

public class Car {
    public String brand;
    public String model;
    public int year;
    public int mileage;

    void drive(int distance) {
        mileage += distance;
        System.out.println(distance + mileage + " Пробега на сегодняшний день.");
    }

    public Car(String newBrand, String newModel, int newYear, int newMileage) {
        brand = newBrand;
        model = newModel;
        year = newYear;
        mileage = newMileage;

    }

    public void printInfo() {
        System.out.println("Бренд автомобиля: " + brand + ". Модель: " + model + ". Года выпуска: " + year + ". Пробег: " + mileage + ".");
    }

}


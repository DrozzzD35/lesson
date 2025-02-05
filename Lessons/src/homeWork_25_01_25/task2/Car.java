package homeWork_25_01_25.task2;

public class Car {
    private String brand;
    private String model;
    private int year;
    private double price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand.isEmpty()) {
            System.out.println("Имя бренда не может быть пустым");
        } else {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model.isEmpty()) {
            System.out.println("Имя модели не может быть пустым");
        } else {
            this.model = model;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1900) {
            System.out.println("У машины " + brand + " " + model + " год не может быть меньше 1900г.");
        } else {
            this.year = year;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            System.out.println("Цена не может быть ниже 0");
        } else {
            this.price = price;
        }
    }

    public void printCars() {
        if (price == 0) {
            return;
        } else if (year == 0) {
            return;
        } else if (model==null) {
            return;
        } else if (brand==null) {
            return;
        } else {
            System.out.println("Бренд: " + brand);
            System.out.println("Модель: " + model);
            System.out.println("Год выпуска: " + year);
            System.out.println("Цена: " + price);
            System.out.println();
        }
    }
}

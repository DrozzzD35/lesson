package homeWork_25_01_25.task2;

public class Main {
    // TODo ошибка тестирования
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.setBrand("БМВ");
        bmw.setModel("х7");
        bmw.setYear(2020);
        bmw.setPrice(1000);

        Car mercedes = new Car();
        mercedes.setBrand("Мерседес");
        mercedes.setModel("Benz");
        mercedes.setYear(2014);
        mercedes.setPrice(1200);

        Car kia = new Car();
        kia.setBrand("Kia");
        kia.setModel("K5");
        kia.setYear(2022);
        kia.setPrice(175);

        Car opel = new Car();
        opel.setBrand("Opel");
        opel.setModel("Astra");
        opel.setYear(2011);
        opel.setPrice(750);

        Garage garage = new Garage();

        garage.addCar(bmw);
        garage.addCar(mercedes);
        garage.addCar(kia);
        garage.addCar(opel);

        System.out.println("До удаления: ");
        System.out.println();

        garage.printAllCars();

        garage.removeCar(kia);
        System.out.println("После удаления: ");
        System.out.println();
        garage.printAllCars();


    }
}

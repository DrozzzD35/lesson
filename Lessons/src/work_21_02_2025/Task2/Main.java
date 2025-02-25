package work_21_02_2025.Task2;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Vehicle bus1 = new Bus("BMW", 80, List.of("Победы", "Краснодонцев", "Горького"));
        Vehicle bus2 = new Bus("BMW", 80, List.of("Победы", "Лермонтова", "Горького"));
        Vehicle bus3 = new Bus("BMW", 80, List.of("Ленина", "Краснодонцев", "Горького"));

        Vehicle car1 = new Car("Mercedes", 160, 4);
        Vehicle car2 = new Car("Lecus", 180, 5);
        Vehicle car3 = new Car("BMW", 200, 6);

        Vehicle truck1 = new Truck("A", 60, 200);
        Vehicle truck2 = new Truck("B", 55, 250);
        Vehicle truck3 = new Truck("C", 40, 300);

        MaintenanceService maintenanceService = new MaintenanceService();
        FleetManager feetmanager = new FleetManager(maintenanceService);

        feetmanager.addVehicle(bus1);
        feetmanager.addVehicle(bus2);
        feetmanager.addVehicle(bus3);
        feetmanager.addVehicle(car1);
        feetmanager.addVehicle(car2);
        feetmanager.addVehicle(car3);
        feetmanager.addVehicle(truck1);
        feetmanager.addVehicle(truck2);
        feetmanager.addVehicle(truck3);

        bus3.setNeedRepair(true);
        truck3.setNeedRepair(true);
        car3.setNeedRepair(true);

        feetmanager.dispatchAll("Гора");

    }
}

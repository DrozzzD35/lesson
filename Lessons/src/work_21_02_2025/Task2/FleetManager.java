package work_21_02_2025.Task2;

import java.util.ArrayList;
import java.util.List;

public class FleetManager {
    private List<Vehicle> vehicles;

    public FleetManager() {
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
        System.out.println("Добавили транспортное средство " + vehicle);
    }

    public void removeVehicle(Vehicle vehicle){
        vehicles.remove(vehicle);
        System.out.println("Удалили транспортное средство " + vehicle);
    }


    public void dispatchAll(String destination){
        for (Vehicle vehicle:vehicles){

        }
    }


}

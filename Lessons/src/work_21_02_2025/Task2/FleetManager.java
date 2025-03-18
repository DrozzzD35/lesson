package work_21_02_2025.Task2;

import homeWork_03_02_2025.task1.ReadingFile;

import java.util.ArrayList;
import java.util.List;

public class FleetManager {
    private List<Vehicle> vehicles;
    private MaintenanceService maintenanceService;


    public FleetManager(MaintenanceService maintenanceService) {
        this.vehicles = new ArrayList<>();
        this.maintenanceService = maintenanceService;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        System.out.println("Добавили транспортное средство " + vehicle.toString());
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
        System.out.println("Удалили транспортное средство " + vehicle.toString());
    }


    public void dispatchAll(String destination) {
        for (Vehicle vehicle : vehicles) {
            if(vehicle.isNeedRepair()){
                maintenanceService.repairVehicle(vehicle);
            }else{
                vehicle.moveTo(destination);
            }
        }
    }
}




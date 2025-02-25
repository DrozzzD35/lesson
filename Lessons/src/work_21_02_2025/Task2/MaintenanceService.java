package work_21_02_2025.Task2;

public class MaintenanceService {
    public void repairVehicle(Vehicle vehicle) {
        System.out.println("Отправляем на ремонт: " + vehicle.getBrand());
        vehicle.setStatus(Status.REPAIRING);
        // ремонтируется
        vehicle.setNeedRepair(false);
        vehicle.setStatus(Status.PARKING);
        System.out.println("Все проблемы с ТС решены: " + vehicle.getBrand());
    }
}

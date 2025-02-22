package work_21_02_2025.Task2;

import java.util.List;

public class Bus extends Vehicle{
    private List<String> stop;

    public Bus(String brand, int speed, List<String> stop) {
        super(brand, speed);
        this.stop = stop;
    }

    public List<String> getStop() {
        return stop;
    }

    @Override
    public void moveTo(String destination){

    }
}

package Interfasas;

import java.util.ArrayList;
import java.util.List;

public class Task1Sample {
    private final List<Vehicle> vehicles = new ArrayList<>();

    public void doIt(){
        vehicles.add(new HoverCraft());
        vehicles.add(new Jeep());
        vehicles.add(new Jeep());
        vehicles.add(new Frigate());

        for (Vehicle vehicle: vehicles){
            printVehicle(vehicle);
        }

    }
    private void printVehicle (final Vehicle vehicle){
        System.out.println(vehicle);

        if (vehicle instanceof LandVehicle){
            ((LandVehicle) vehicle).drive();
        }
    }
}

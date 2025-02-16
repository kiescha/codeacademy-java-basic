package Interfasas;

public class Jeep implements LandVehicle {

    public void soundHorn(){};

    @Override
    public int getNumWheels() {
        return 0;
    }

    @Override
    public void setNumWheels(int numWheels) {

    }

    @Override
    public void drive() {
        System.out.println("Vaziuoja");
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public String setName(String name) {
        return "";
    }

    @Override
    public int getMaxPassangers() {
        return 0;
    }

    @Override
    public void setMaxPassangers(int maxPassanger) {

    }

    @Override
    public void setMaxSpeed(int maxSpeed) {

    }

    @Override
    public int getMaxSpeed() {
        return 0;
    }
}

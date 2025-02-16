package Interfasas;

public class HoverCraft implements SeaVessel, LandVehicle{
    public void enterLand() {

    }

    public void enterSea(){

    };

    @Override
    public int getNumWheels() {
        return 0;
    }

    @Override
    public void setNumWheels(int numWheels) {

    }

    @Override
    public void drive() {
        System.out.println("vaziuoja");
    }

    @Override
    public void setDisplacement(int displacement) {

    }

    @Override
    public int getDisplacement() {
        return 0;
    }

    @Override
    public void launch() {

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

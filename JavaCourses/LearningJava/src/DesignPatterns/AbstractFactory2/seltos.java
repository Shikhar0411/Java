package DesignPatterns.AbstractFactory2;

public class seltos implements Vehicle{

    @Override
    public String getVehicleName() {
        return "seltos";
    }

    @Override
    public String getVehicleStatus() {
        return "ordinary";
    }
}

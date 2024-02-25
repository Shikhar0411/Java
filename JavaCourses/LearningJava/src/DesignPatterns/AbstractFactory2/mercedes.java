package DesignPatterns.AbstractFactory2;

public class mercedes implements Vehicle{
    @Override
    public String getVehicleName() {
        return "mercedes";
    }

    @Override
    public String getVehicleStatus() {
        return "luxury";
    }
}
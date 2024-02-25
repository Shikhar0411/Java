package DesignPatterns.AbstractFactory2;

public class bmw implements Vehicle{

    @Override
    public String getVehicleName() {
        return "bmw";
    }

    @Override
    public String getVehicleStatus() {
        return "luxury";
    }
}

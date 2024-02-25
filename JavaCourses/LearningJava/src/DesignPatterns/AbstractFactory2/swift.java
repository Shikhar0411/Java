package DesignPatterns.AbstractFactory2;

public class swift implements Vehicle{

    @Override
    public String getVehicleName() {
        return "swift";
    }

    @Override
    public String getVehicleStatus() {
        return "ordinary";
    }
}

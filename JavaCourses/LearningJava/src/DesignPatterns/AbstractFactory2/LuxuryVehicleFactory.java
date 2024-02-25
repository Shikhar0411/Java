package DesignPatterns.AbstractFactory2;

public class LuxuryVehicleFactory implements AbstractVehicleFactory{
    @Override
    public Vehicle getVehicle(String vehicleName) {
        switch (vehicleName){
            case "mercedes":
                return new mercedes();
            case "bmw":
                return new bmw();
            default:
                return null;
        }
    }
}

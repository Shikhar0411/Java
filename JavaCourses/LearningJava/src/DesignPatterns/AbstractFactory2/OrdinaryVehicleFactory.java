package DesignPatterns.AbstractFactory2;

public class OrdinaryVehicleFactory implements AbstractVehicleFactory{
    @Override
    public Vehicle getVehicle(String vehicleName) {
        switch (vehicleName){
            case "swift":
                return new swift();
            case "seltos":
                return new seltos();
            default:
                return null;
        }
    }
}

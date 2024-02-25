package DesignPatterns.AbstractFactory2;

public class Client {
    public Vehicle vehicle;

    public Client(AbstractVehicleFactory factory, String vehicleName) {
        vehicle = factory.getVehicle(vehicleName);
    }

    public void printData(){
        System.out.println("Vehicle Name: " + vehicle.getVehicleName());
        System.out.println("Vehicle Status: " + vehicle.getVehicleStatus());
    }
}

package DesignPatterns.AbstractFactory2;

import DesignPatterns.AbstractFactory2.Client;

public class Main {
    public static void main(String[] args) {
        Client client = new Client(new LuxuryVehicleFactory(),"bmw");
        client.printData();
    }
}
